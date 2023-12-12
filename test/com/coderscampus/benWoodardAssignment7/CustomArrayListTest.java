package com.coderscampus.benWoodardAssignment7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_one_item_to_list() {
		@SuppressWarnings("unchecked")
		CustomList<Integer> sut = new CustomArrayList<>();
		
		sut.add(0);
		
		assertEquals(0, sut.get(0));
	}

	@Test
	void should_add_11_items_to_list () {
		@SuppressWarnings("unchecked")
		CustomList<Integer> sut = new CustomArrayList<>();
		for(int i = 0; i < 11; i++) {
			sut.add(i);
		}
		
		assertEquals(10, sut.get(11));
	}
}
