package com.pooja.ccpp;

// Write a Java Program to print the digits of a Given Number. 

import java.util.Scanner;

public class PrintDigits_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp=num;
		System.out.print("Digits in given number are : ");
		while(temp!=0) {
			int digit=temp%10;
			System.out.print(digit+" , ");
			temp=temp/10;
		}
		
	}

}
