package com.coderscampus.benWoodardAssignment7;

import java.util.ArrayList;
import java.util.List;

public class CustomListApplication {

	public static void main(String[] args) {
		
		
		CustomList<Integer> customList = new CustomArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			customList.add(i);
		}
		
		
		customList.remove(9);
		customList.remove(7);
		customList.add(1000);
		customList.add(7, 1001);

		System.out.println(customLis);
		
		for(int i = 0; i < 20; i++) {
			System.out.println(customList.get(i)); 
		}

	}
	
}
