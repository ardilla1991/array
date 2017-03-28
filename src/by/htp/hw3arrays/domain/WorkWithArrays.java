package by.htp.hw3arrays.domain;

public class WorkWithArrays {
	
	private int[] arr;
	
	public WorkWithArrays() {
		System.out.println("********* homework 3   ******************");
		arr = new int[]{};
	}
	
	public void printArray() {
		if ( arr.length > 0 ) {
			for ( int el : arr) {
				System.out.print(" " + el);
			}
		} else {
			System.out.print("Array is empty");
		}
		System.out.println();
	}
	
	public void addElement(int element) {
		int arrService[] = new int[arr.length + 1];
		//System.arraycopy(arr, 0, arrService, 0, arr.length);
		for (int i = 0; i < arr.length; i++){
			arrService[i] = arr[i];
		}
		arrService[arr.length] = element;
		
		arr = arrService;
	}
	
	public int findMax() {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if ( arr[i] > max ) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public int findMin() {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if ( arr[i] < min ) {
				min = arr[i];
			}
		}
		
		return min;
	}
	
	public void sortDescAndPrint() {
		int serviceEl = 0;
		for ( int i = 0; i < arr.length; i++ ) {
			for ( int j = i + 1; j < arr.length; j++ ) {
				if ( arr[j] > arr[i] ) {
					serviceEl = arr[i];
					arr[i] = arr[j];
					arr[j] = serviceEl;
				}
			}
		}
		
		System.out.print("Sort Desc: ");
		printArray();
	}
	
	public void sortAscAndPrint() {
		int serviceEl = 0;
		for ( int i = 0; i < arr.length; i++ ) {
			for ( int j = i + 1; j < arr.length; j++ ) {
				if ( arr[j] < arr[i] ) {
					serviceEl = arr[i];
					arr[i] = arr[j];
					arr[j] = serviceEl;
				}
			}
		}
		
		System.out.print("Sort Asc: ");
		printArray();
	}
}
