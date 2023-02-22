/*
 * Write a java program to rotate a n*n matrix in anti-clock wise direction.
Example for 3*3 matrix
Input:
1 2 3
4 5 6
7 8 9
Output:
2 3 6
1 5 9
4 7 8
 * */

package com.pooja.ccpp;

import java.util.*;
 
public class RotateMatrix {
 
	//method to print matrix
	public static void printMatrix(int rows, int cols, int matrix[][]) {
		for(int i=0; i<rows; i++) {
			for(int j= 0 ; j<cols; j++) {
				 System.out.print( matrix[i][j]+" ");
			}
			System.out.println( );
		}
	}
	
	//method to rotate the matrix in anticlockwise
	public static int[][] rotateMatrix(int[][] matrix, int n) {
        int[][] rotatedMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMatrix[i][j] = matrix[j][n - 1 - i];
            }
        }

        return rotatedMatrix;
    }
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no of rows and columns of matrix : ");	
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int arr[][]=new int[rows][cols];
		
		System.out.println("Enter the elements of matrix : ");
		for(int i=0; i<rows; i++) {
			for(int j= 0 ; j<cols; j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Original matrix : ");
		printMatrix(rows, cols, arr);
		
		
		int[][] rotatedMatrix = rotateMatrix(arr, rows);

		System.out.println("Rotated matrix in anticlockwise direction: ");
		printMatrix(rows, cols, rotatedMatrix);
		  
	}
  
}  