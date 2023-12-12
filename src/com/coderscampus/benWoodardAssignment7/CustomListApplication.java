package com.coderscampus.benWoodardAssignment7;

import java.util.ArrayList;
import java.util.List;

public class CustomListApplication {

	public static void main(String[] args) {
		
		
		CustomList<Integer> customList = new CustomArrayList<>();
		
		for(int i = 0; i < 4; i++) {
			customList.add(i);
		}
		
		customList.remove(3);
		System.out.println(customList.get(0));
		System.out.println(customList.get(1));
		System.out.println(customList.get(2));
		System.out.println(customList.get(3));
		System.out.println(customList.get(4));
		System.out.println(customList.get(5));

	}
	
}
