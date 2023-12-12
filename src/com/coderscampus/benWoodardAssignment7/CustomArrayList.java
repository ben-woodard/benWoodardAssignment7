package com.coderscampus.benWoodardAssignment7;

import java.lang.reflect.Array;

public class CustomArrayList<T> implements CustomList {

	Object[] items = new Object[10];
	private int size = 0;

	@Override
	public boolean add(Object item) {
		items[size] = item;
		size++;
		return false;
	}

	@Override
	public boolean add(int index, Object item) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object get(int index) throws IndexOutOfBoundsException {
		return items[index];
	}

	@Override
	public Object remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

}
