package javaCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaArrays obj = new JavaArrays();
		obj.arraySort_Ascendingorder_withoutSORT();

	}

	public void arraySort_Ascendingorder() {
		int myarray[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };

		System.out.println("length of array = myarray.length = " + myarray.length);

		Arrays.sort(myarray);

		System.out.println("Arrays.sort : " + Arrays.toString(myarray));

	}

	public void arraySort_Ascendingorder_withoutSORT() {
		int myarray[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		int temp;

		for (int i = 0; i < myarray.length; i++) {
			{
				for (int j = i + 1; j < myarray.length; j++) {
					if (myarray[i] > myarray[j]) {
						temp = myarray[i];
						myarray[i] = myarray[j];
						myarray[j] = temp;
					}
				}
			}
		}

		System.out.print("Ascending Order:");
		for (int i = 0; i < myarray.length - 1; i++) {
			System.out.print(myarray[i] + ",");
		}
		System.out.print(myarray[myarray.length - 1]);

	}

	public void array_findElement() {
		int myarray[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };

		int arrayelement = -9;
		System.out.println("length of array = myarray.length = " + myarray.length);

		System.out.println(
				"Found element : " + arrayelement + "  @ position = " + Arrays.binarySearch(myarray, arrayelement));

	}

	public void array2d() {
		String[][] myarray2d = new String[2][5];
		System.out.println("Dimension 1: " + myarray2d.length);
		System.out.println("Dimension 2: " + myarray2d[0].length);
	}

	public void arrayequal() {
		int[] ary = { 1, 2, 3 };
		int[] ary1 = { 3, 2, 1 };

		System.out.println("Is array 1 equal to array 2?? before sort " + Arrays.equals(ary, ary1));

		Arrays.sort(ary1);

		System.out.println("Is array 1 equal to array 2?? " + Arrays.equals(ary, ary1));

	}

	public void array_find_duplicates() {
		int[] findduplicates = { 1, 2, 2, 3, 4, 4, 5, 5, 6, 7 };

	}

	public void array_find_nonduplicates() {
		int[] findnonduplicates = { 1, 2, 2, 3, 4, 4, 5, 5, 6, 7 };

	}

	public void smallest_ndigit_number_fromArray() {
		int[] arr = { 1, 4, 0, 2 };
		Arrays.sort(arr);
		System.out.println("smallest_ndigit_number_fromArray = 0241");
	}

	public void small_big_number_inArray() {
		int[] arr = { 1, 4, 0, 2 };
		Arrays.sort(arr);
		System.out.println("Smallest: " + arr[0]);
		System.out.println("Largest: " + arr[arr.length - 1]);
	}

	public void sumofalldigits_StringArray() {

	}

	public void array_toString_deepToString() {
		// Trying to print array of strings using toString
		String[] strs = new String[] { "practice.geeksforgeeks.org", "quiz.geeksforgeeks.org" };
		System.out.println(Arrays.toString(strs));

		// Trying to print multidimensional array using
		// toString
		int[][] mat = new int[2][2];
		mat[0][0] = 99;
		mat[0][1] = 151;
		mat[1][0] = 30;
		mat[1][1] = 50;
		System.out.println(Arrays.deepToString(mat));

	}

	public void differenceBetween_Array_ArrayList() {

		/* ........... Normal Array............. */
		// Need to specify the size for array
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		// We cannot add more elements to array arr[]

		/* ............ArrayList.............. */
		// Need not to specify size
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);
		// We can add more elements to arrL

		System.out.println(arrL);
		System.out.println(Arrays.toString(arr));

	}

	public void final_Array_ex1() {
		final int arr[] = { 1, 2, 3, 4, 5 }; // Note: arr is final
		System.out.println("final_Array");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 10;
			System.out.print(", ");
			System.out.print(arr[i]);
		}

	}

	public void final_Array_ex2() {
		final int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 10, 20, 30, 40, 50 };
		arr2 = arr1;
		// arr1 = arr2; thows error
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

	public void Jagged_Array() {
		// Declaring 2-D array with 2 rows
		int arr[][] = new int[2][];

		// Making the above array Jagged

		// First row has 3 columns
		arr[0] = new int[3];

		// Second row has 2 columns
		arr[1] = new int[2];

		// Initializing array
		int count = 0;
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = count++;

		// Displaying the values of 2D Jagged array
		System.out.println("Contents of 2D Jagged Array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
}
