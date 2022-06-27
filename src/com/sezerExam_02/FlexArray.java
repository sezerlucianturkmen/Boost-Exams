package com.sezerExam_02;

public class FlexArray {

	int[] array = new int[0];

	public void addComponant(int number) {

		int[] updatedArray = new int[array.length + 1];
		for (int i = 0; i < array.length; i++) {

			updatedArray[i] = array[i];

			updatedArray[updatedArray.length - 1] = number;
		}
		array = updatedArray;

	}

	/**
	 * 
	 * @param number silinmek istenilen eleman..
	 */

	public void deleteComponant(int number) {

		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number)
				temp = i;

		}

		int indexNumber = temp;
		System.out.println(indexNumber);

		int[] updatedArray = new int[array.length - 1];

		for (int i = 0; i < array.length; i++) {

			if (i < indexNumber) {
				updatedArray[i] = array[i];
			} else if (i == indexNumber) {
				updatedArray[i] = array[i + 1];
			} else if (i > indexNumber && i < updatedArray.length) {
				updatedArray[i] = array[i + 1];
			}

		}

		array = updatedArray;

	}

	public void addBtw(int number, int indexNumber) {

		int[] updatedArray = new int[array.length + 1];

		for (int i = 0; i < array.length; i++) {

			if (i < indexNumber) {
				updatedArray[i] = array[i];
			} else if (i == indexNumber) {

				int temp = array[i];
				updatedArray[i] = number;
				updatedArray[i + 1] = temp;

			} else if (i > indexNumber) {
				updatedArray[i + 1] = array[i];
			}

		}
		array = updatedArray;
	}

	public void list() {
		System.out.println("------List-----");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println("------------");
	}

}
