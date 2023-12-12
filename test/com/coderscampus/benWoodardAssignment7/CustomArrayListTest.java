package com.coderscampus.benWoodardAssignment7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	//Testing add(index) method
	@Test
	void should_add_one_item_to_list() {
		@SuppressWarnings("unchecked")
		//Arrange
		CustomList<Integer> sut = new CustomArrayList<>();
		//Act
		sut.add(0);
		//Assert
		assertEquals(0, sut.get(0));
	}

	@Test
	void should_add_21_items_to_list () {
		@SuppressWarnings("unchecked")
		//Arrange
		CustomList<Integer> sut = new CustomArrayList<>();
		//Act
		for(int i = 0; i < 21; i++) {
			sut.add(i);
		}
		//Assert
		assertEquals(20, sut.get(20));
	}
	
	//Testing add(index, item) method
	
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
		
		for(int i = 0; i < 4; i++) {
			sut.add(i);
		}

		sut.add(2, 9);
		
		assertEquals(2, sut.get(3));
	}
	
//	@Test
//	void should_throw_IndexOutOfBoundsException_if_index_does_not_exist() {
//		CustomList<Integer> sut = new CustomArrayList<>();
//		Exception indexException = new IndexOutOfBoundsException();
//		Exception exception = assertThrows(Exception, () -> sut.add(15, 15));
//		sut.add(15, 15);
//		
//		assertThrows(exception, sut.add(15, 15));
//	}
	
	
	//Test getSize Method
	
	@Test
	void should_return_size_equals_11() {
		CustomList<Integer> sut = new CustomArrayList<>();
		
		for(int i = 0; i < 11; i++) {
			sut.add(i);
		}
		
		assertEquals(11, sut.getSize());
	}
	
	//Test remove method
	
	@Test 
	void should_remove_element_at_index_and_shift_elements_to_left() {
	CustomList<Integer> sut = new CustomArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			sut.add(i);
		}
		
		sut.remove(2);
		
		assertEquals(3, sut.get(2));
	}
	
	
}
