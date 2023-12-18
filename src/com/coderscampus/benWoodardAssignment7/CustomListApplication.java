package com.coderscampus.benWoodardAssignment7;

public class CustomListApplication {

	public static void main(String[] args) {

		@SuppressWarnings("unchecked")
		CustomList<Integer> customList = new CustomArrayList<>();

		for (int i = 0; i < 20; i++) {
			customList.add(i);
		}

	

// 		customList.remove(9);
//		customList.remove(7);
//		customList.add(1000);
//		customList.add(7, 1001);
//		customList.add(7, 1002);
//		customList.add(7, 89);
//		customList.remove(7);
//		customList.add(2000);
//		customList.add(3000);
//	
//	
		for(int i = 0; i < 1000; i++) {
			System.out.println(customList.get(i));
		}
	}
}
