package javaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void arraylist_reverse() {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");

		Collections.reverse(arrayList);

		System.out.println("After Reverse Order: " + arrayList);

	}

	public static void arraylist_sort() {

		ArrayList<Integer> myintarray = new ArrayList<Integer>();
		myintarray.add(5);
		myintarray.add(3);
		myintarray.add(8);
		System.out.println("Before sort: " + myintarray);

		Collections.sort(myintarray);

		System.out.println("After Sort: " + myintarray);
	}

	public static void arrary_Min_max() {
		Integer[] myintarray = { 8, 2, 7, 1, 4, 9, 5 };
		int min = (int) Collections.min(Arrays.asList(myintarray));
		int max = (int) Collections.max(Arrays.asList(myintarray));

		System.out.println("Min number: " + min);
		System.out.println("Max number: " + max);
	}

}
