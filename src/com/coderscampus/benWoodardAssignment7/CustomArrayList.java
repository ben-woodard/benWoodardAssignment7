package com.coderscampus.benWoodardAssignment7;

import java.lang.reflect.Array;

public class CustomArrayList<T> implements CustomList {

	Object[] items = new Object[10];
	Object[] newItems = new Object[items.length];
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
		size += 1;
		if
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
		items[index] = null;
		adjustForNull(index);	
		size -= 1;
		return items[index];
	}

	//adjusting for null values in remove method
	private Object adjustForNull(int index) {
		for (int i = 0; i < items.length; i++) {
			if (i < index) {
				newItems[i] = items[i];
			} else if (i == items.length - 1) {
				break;
			} else if (items[i] == null) {
				newItems[i] = items[i + 1];
				items[i + 1] = null;
			}
		}
		items = newItems;
		return items;
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

	// Method to shift elements to right with index >= index parameter
	private void shiftArrayToRightAtIndex(int index, Object item) {
		int i = 0;
		while (items[i] != null) {
			if (i == index) {
				newItems[i + 1] = items[i];
				newItems[i] = item;
			} else if (i < index) {
				newItems[i] = items[i];
			} else {
				newItems[i + 1] = items[i];
			}
			i++;
		}
		items = newItems;
	}

}
