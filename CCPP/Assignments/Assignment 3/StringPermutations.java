/*
 Write a java program to print all the permutation of entered string.

e.g. if entered string is “RAM” then the output be like
RMA
ARM
AMR
MAR
MRA
 */

package com.pooja.ccpp;
import java.util.Scanner;

public class StringPermutations {

	public static void getPermutations(String str, String sol) {
		
		if(str.length()==0) {
			System.out.println(sol);
			return;
		}
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			String leftSubstring= str.substring(0,i);
			String ri8Substring = str.substring(i+1);
			
			String restPart = leftSubstring+ri8Substring;
			getPermutations(restPart, sol+c);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string : ");	
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		
		System.out.println("All possible permutations of entred substring are : ");
		getPermutations(s1, "");
		
	}

}
/*
Output :-----------------------
Enter the string : 
RAM
All possible permutations of entred substring are : 
RAM
RMA
ARM
AMR
MRA
MAR
 */