package com.controlstatements;
public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("1D Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();  
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("\n2D Array:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); 
        }
    }
}
