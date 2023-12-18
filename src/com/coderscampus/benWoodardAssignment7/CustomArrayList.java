package com.coderscampus.benWoodardAssignment7;

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
		if (index > items.length - 1 || index < items.length) {
			throw new IndexOutOfBoundsException();
		} else {
			doubleArrayLength();
			if (items[index] != null) {
				shiftArrayToRightAtIndex(index, item);
			} else {
				items[index] = item;
			}
			size++;
			return true;
		}
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public Object get(int index) throws IndexOutOfBoundsException {
		if (index > items.length - 1 || index < items.length) {
			throw new IndexOutOfBoundsException();
		} else {
			return items[index];
		}
	}

	@Override
	public Object remove(int index) throws IndexOutOfBoundsException {
		if (index > items.length - 1 || index < items.length) {
			throw new IndexOutOfBoundsException();
		} else {
			items[index] = null;
			adjustForNull(index);
			size--;
			return items[index];
		}
	}

	// adjusting for null values in remove method
	private void adjustForNull(int index) {
		Object[] newItems = new Object[items.length];
		for (int i = 0; i < items.length; i++) {
			if (i < index) {
				newItems[i] = items[i];
			} else if (i == items.length - 1 && items[i] == null) {
				break;
			} else if (items[i] == null) {
				newItems[i] = items[i + 1];
				items[i + 1] = null;
			}
		}
		items = newItems;
	}

	// Method to double size of itemsArray
	private void doubleArrayLength() {
		if (size == items.length) {
			Object[] newItems = new Object[items.length * 2];
			for (int i = 0; i < items.length; i++) {
				newItems[i] = items[i];
			}
			items = newItems;
		}
	}

	// Method to shift elements to right with index >= index parameter
	private void shiftArrayToRightAtIndex(int index, Object item) {
		Object[] newItems = new Object[items.length];
		for (int i = items.length - 1; i >= 0; i--) {
			if (i < index) {
				newItems[i] = items[i];
			} else if (i == index) {
				newItems[i] = item;
			} else if (i > index) {
				newItems[i] = items[i - 1];
			}
		}
		items = newItems;
	}

}
