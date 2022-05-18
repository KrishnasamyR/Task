package array;

import java.util.Scanner;

public class ArraySorter {
	
	DataStorage dataStorage = new DataStorage();
	
	void getTheArrayElements() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the length of Array:");
		
		try { dataStorage.setLengthOfTheArray(scan.nextInt());
		}
		catch (Exception exception) {
			System.out.println("Input MismatcException : Verify the entered input"+exception);
		}

		System.out.println("Enter the Array Elements :");
		int array[] = new int[dataStorage.getLengthOfTheArray()];
		

		try {
			for (int iterate = 0; iterate < dataStorage.getLengthOfTheArray(); iterate++) {
				array[iterate] = scan.nextInt();
			}
		} 
		catch (Exception exception) {
			System.out.println("InputMismatch Exception Occured" + exception);
		}
		
		dataStorage.setUnSortedArray(array);
		scan.close();

		System.out.println("Array Length is : " + dataStorage.getLengthOfTheArray());
		
		int arrayOne[] = dataStorage.getUnSortedArray();
		System.out.print("Unsorted Array is : ");
		
		for (int iterator = 0; iterator < arrayOne.length; iterator++)
			System.out.print(arrayOne[iterator] + " ");
	}

	void sortTheArrayInAscendingOrder() {
		
		int unSortedArray[] = dataStorage.getUnSortedArray();
		
		for (int countOne = 0; countOne < unSortedArray.length; countOne++) {
			
			for (int countTwo = 0; countTwo < unSortedArray.length; countTwo++) {
				
				int temp = 0;
				
				if (unSortedArray[countOne] < unSortedArray[countTwo]) {
					
					temp = unSortedArray[countOne];
					unSortedArray[countOne] = unSortedArray[countTwo];
					unSortedArray[countTwo] = temp;
				}
			}

		}
		dataStorage.setArraySortedInAscendingOrder(unSortedArray);
	}

	void sortTheArrayInDescendingOrder() {
		
		int unSortedArray[] = dataStorage.getUnSortedArray();
		
		for (int countOne = 0; countOne < unSortedArray.length; countOne++) {
			
			for (int countTwo = 0; countTwo < unSortedArray.length; countTwo++) {
				
				int temp = 0;
				
				if (unSortedArray[countOne] > unSortedArray[countTwo]) {
					temp = unSortedArray[countOne];
					unSortedArray[countOne] = unSortedArray[countTwo];
					unSortedArray[countTwo] = temp;
				}
			}

		}
		dataStorage.setArraySortedInDescendingOrder(unSortedArray);

	}

	void displayTheArraySortedInAscendingOrder() {
		int arrayOne[] = dataStorage.getArraySortedInAscendingOrder();
		System.out.print("\nAscending Order is :");
		for (int iterator = 0; iterator < arrayOne.length; iterator++)
			System.out.print(arrayOne[iterator] + " ");
	}

	void displayTheArraySortedInDescendingOrder() {
		int arrayTwo[] = dataStorage.getArraySortedInDescendingOrder();
		System.out.print("\nDescending Order is :");
		for (int iterator = 0; iterator < arrayTwo.length; iterator++)
			System.out.print(arrayTwo[iterator] + " ");

	}

}