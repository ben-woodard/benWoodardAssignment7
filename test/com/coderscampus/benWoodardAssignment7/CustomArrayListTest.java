package com.coderscampus.benWoodardAssignment7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	// Testing add(index) method
	@Test
	void should_add_10_items_to_list_and_list_size_not_doubled() {
		@SuppressWarnings("unchecked")
		
		CustomList<Integer> sut = new CustomArrayList<>();
		for(int i = 0; i < 10; i++) {
			sut.add(i);
		}
		
		for(int i = 0; i < 10; i++) {
			assertEquals(i, sut.get(i));
		}
		assertThrows(IndexOutOfBoundsException.class, ()-> sut.get(10));
	}

	@Test
	void should_add_51_items_to_list() {
		@SuppressWarnings("unchecked")
		// Arrange
		CustomList<Integer> sut = new CustomArrayList<>();
		// Act
		for (int i = 0; i < 51; i++) {
			sut.add(i);
		}
		// Assert
		for (int i = 0; i < 51; i++) {
			assertEquals(i, sut.get(i));
		}
	}
	
	@Test 
	void should_shift_null_values_to_end_of_array () {
		@SuppressWarnings("unchecked")
		CustomList<Integer> sut = new CustomArrayList<>();
		for (int i = 0; i < 8; i++) {
			sut.add(i);
		}
		
		sut.add(1000);
		assertEquals(1000, sut.get(8));
		assertEquals(null, sut.get(9));

	}
	
	
	// Testing add(index, item) method

	@Test
	void should_add_item_at_index() {
		@SuppressWarnings("unchecked")
		CustomList<Integer> sut = new CustomArrayList<>();

		sut.add(2, 2);

		assertEquals(2, sut.get(2));

	}

	@Test
	void should_shift_items_to_right_of_added_item() {
		@SuppressWarnings("unchecked")
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < 4; i++) {
			sut.add(i);
		}

		sut.add(2, 9);

		assertEquals(2, sut.get(3));
	}
	
	@Test
	void should_throw_exception_for_item_added_out_of_bounds() {
		@SuppressWarnings("unchecked")
		CustomList<Integer> sut = new CustomArrayList<>();

		assertThrows(IndexOutOfBoundsException.class, () -> sut.add(20, 1));
	}

	// Testing getSize Method

	@Test
	void should_return_size_equals_11() {
		@SuppressWarnings("unchecked")
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < 11; i++) {
			sut.add(i);
		}
		System.out.println(sut.getSize());
		assertEquals(11, sut.getSize());
	}

	// Testing remove method

	@Test
	void should_remove_element_at_index_and_shift_elements_to_left() {
		@SuppressWarnings("unchecked")
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < 5; i++) {
			sut.add(i);
		}

		sut.remove(2);

		assertEquals(3, sut.get(2));
	}

	@Test
	void should_throw_exception_removing_out_of_bounds_element() {
		@SuppressWarnings("unchecked")
		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < 5; i++) {
			sut.add(i);
		}

		assertThrows(IndexOutOfBoundsException.class, () -> sut.remove(12));
	}
}
