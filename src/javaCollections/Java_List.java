package javaCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java_List o = new Java_List();
		o.small_big_number_Array_List_Collections();
	}

	private void small_big_number_Array_List_Collections() {
		Integer arr[] = { 1, 2, 5, 6, 3, 2 };
		Arrays.sort(arr);
		System.out.println("Smallest: " + arr[0]);
		System.out.println("Largest: " + arr[arr.length - 1]);

		List<Integer> Listarr = Arrays.asList(arr);
		Collections.sort(Listarr);

		System.out.println("Smallest: " + Listarr.get(0));
		System.out.println("Largest: " + Listarr.get(Listarr.size() - 1));

		System.out.println("Collections.min: " + Collections.min(Listarr));
		System.out.println("Collections.max: " + Collections.max(Listarr));

	}

}
