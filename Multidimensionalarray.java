package com.controlstatements;

public class Multidimensionalarray {

	    public static void main(String[] args) {

	        int[][] matrix = new int[3][4];
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                matrix[i][j] = i * matrix[i].length + j + 1;
	            }
	        }
	        System.out.println("Multi Dimensional Array:");
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println(); 
	        }
	    }
	}


