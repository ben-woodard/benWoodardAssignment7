package com.coderscampus.benWoodardAssignment7;

public class CustomArrayList<T> implements CustomList {

	Object[] items = new Object[10];
	private int size = 0;

	@Override
	public boolean add(Object item) {
		return add(size, item);
	}

	@Override
	public boolean add(int index, Object item) throws IndexOutOfBoundsException {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		doubleArrayLengthWhenFull();
		for (int i = size; i > index; i--) {
			items[i] = items[i - 1];
		}
		items[index] = item;
		size++;
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public Object get(int index) throws IndexOutOfBoundsException {
		if (index > items.length - 1 || index < 0) {
			throw new IndexOutOfBoundsException();
		} else {
			return items[index];
		}
	}

	@Override
	public Object remove(int index) throws IndexOutOfBoundsException {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		Object removedItem = items[index];
		for (int i = index; i < size - 1; i++) {
			items[i] = items[i + 1];
		}

		items[size - 1] = null;
		return removedItem;
	}

	// Method to double size of itemsArray
	private void doubleArrayLengthWhenFull() {
		if (size == items.length) {
			Object[] newItems = new Object[items.length * 2];
			for (int i = 0; i < items.length; i++) {
				newItems[i] = items[i];
			}
			items = newItems;
		}
	}

}
