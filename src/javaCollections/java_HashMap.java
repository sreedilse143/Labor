package javaCollections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class java_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java_HashMap obj = new java_HashMap();
		obj.multipleValues_aslist_intoMap();
		obj.multipleValues_asArray_intoMap();
	}

	public void multipleValues_aslist_intoMap() {
		// Create a HashMap of key as String List Of integers as Value
		HashMap<String, List<Integer>> mv = new HashMap<>();
		// Create an array Of Occurrences
		Integer[] intarray = { 12, 8, 4, 1 };

		// Add List as value in the map
		mv.put("one", Arrays.asList(intarray));

		// Add List as value in the map
		mv.put("two", Arrays.asList(new Integer[] { 28, 44, 22, 89 }));

		// Print the Map Contents
		System.out.println(mv);

	}

	public void multipleValues_asArray_intoMap() {
		// Create a HashMap of key as String List Of integers as Value
		HashMap<String, Integer[]> mv = new HashMap<String, Integer[]>();
		// Create an array Of Occurrences
		Integer[] intarray = { 12, 8, 4, 1 };

		// Add List as value in the map
		mv.put("one", intarray);

		// Add List as value in the map
		mv.put("two", new Integer[] { 28, 44, 22, 89 });

		// Print the Map Contents
		System.out.println(mv.toString());

	}
}
