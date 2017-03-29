package by.htp.array.launch;

import java.util.Scanner;

import by.htp.array.domain.WorkWithArrays;

public class Main {
	
	private static String breakWord = "stop";
	
	public static void main(String[] args) {	
		WorkWithArrays hw3 = new WorkWithArrays();
		hw3.printArray();
		
		Scanner inString = new Scanner(System.in);
		System.out.print("Please, enter the first element: ");
		String element;
		
		CheckInput checkInput = new CheckInput();
		if ( inString.hasNext() ) {
			do {
				element = inString.nextLine();
				if ( !(element.equals(breakWord) ) ) {
					System.out.print("Enter the next element or enter '" + breakWord + "' for break: ");
					if ( checkInput.checkNumber(element) ) {
						//int elementInt = new Integer(element);
						int elementInt = Integer.valueOf(element);
						hw3.addElement(elementInt);
					}
				}
			}
			while ( !(element.equals(breakWord) ) );
		}		
		inString.close();
		
		hw3.printArray();
		
		System.out.println("Max = " + hw3.findMax());
		System.out.println("Min = " + hw3.findMin());
		
		hw3.sortDescAndPrint();
		hw3.sortAscAndPrint();
	}
}
