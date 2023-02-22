/*
Write a java program to reverse words of given string/sentence word by word.
e.g. If entered sentence is “I Love India”
output: I evoL aidnI
*/
package com.pooja.ccpp;

import java.util.*;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
 
		System.out.println("Enter the string : ");	
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = "";
		char c;
		
		String[] words = s1.split(" ");
		
		System.out.println("Reversed string is : ");
		for(String str:words) {
			for(int i=0; i<str.length(); i++) {
				c = str.charAt(i);
				s2 = c+s2;
			} 
			System.out.print(s2+" ");
			s2="";
		}
	}
}

/*
Output :-----------------------
 
Enter the string : 
I love India
Reversed string is : 
I evol aidnI 

*/
