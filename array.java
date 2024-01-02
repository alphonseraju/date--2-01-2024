package com.controlstatements;

public class array {
	public static class ArrayLiteralExample {
	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5};

	        String[] names = {"A", "B", "C", "D"};
	        Object[] mixedArray = {1., "Hey", 3.14, true};
	        printArray(numbers);
	        printArray(names);
	        printArray(mixedArray);
	    }

	    private static void printArray(int[] numbers) {
			
		}
	    public static void printArray(Object[] mixedArray) {
	        for (Object element : mixedArray) {
	            System.out.print(element + "can i now ");
	        }
	        System.out.println();
	    }
	}


}
