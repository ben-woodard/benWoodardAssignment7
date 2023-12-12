package com.coderscampus.benWoodardAssignment7;

import java.lang.reflect.Array;

public class CustomArrayList<T> implements CustomList {

	Object[] items = new Object[10];
	private int size = 0;

	@Override
	public boolean add(Object item) {
		doubleArrayLength();
		items[size] = item;
		size++;
		return true;
	}

	@Override
	public boolean add(int index, Object item) throws IndexOutOfBoundsException {
		if (items[index] != null) {
			shiftArrayToRightAtIndex(index, item);
		} else {
			items[index] = item;
		}
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public Object get(int index) throws IndexOutOfBoundsException {
		return items[index];
	}

	@Override
	public Object remove(int index) throws IndexOutOfBoundsException {
		Object[] newArray = new Object[items.length];
		int i = 0;
		for(Object element : items) {
			if(i < index) {
				newArray[i] = items[i];
				i++;
			} else {
				newArray[i] = items[i + 1];
			}
		}
		items = newArray;
		return items[index];
	}

	// Method to double size of itemsArray
	private Object[] doubleArrayLength() {
		if (items.length == size) {
			Object[] newArray = new Object[items.length * 2];
			int i = 0;
			for (Object element : items) {
				newArray[i] = items[i];
				i++;
			}
			items = newArray;
			return items;
		} else {
			return items;
		}
	}

	// Method to shift elements with index >= index parameter, index + 1
	private Object[] shiftArrayToRightAtIndex(int index, Object item) {
		Object[] newArray = new Object[items.length];
		for (int i = 0; i <= items.length - 1; i++) {
			if (items[i] == null) {
				break;
			} else if (i == index) {
				newArray[i + 1] = items[i];
				newArray[i] = item;
			} else if (i < index) {
				newArray[i] = items[i];
			} else {
				newArray[i + 1] = items[i];
			}
		}
		items = newArray;
		return items;
	}

}
