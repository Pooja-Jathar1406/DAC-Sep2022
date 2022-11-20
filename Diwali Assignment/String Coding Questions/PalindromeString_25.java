/*
25. This question is asked by Facebook. Given a string, return whether or not it forms a palindrome ignoring case and non-alphabetical characters.
*/

import java.lang.*;
import java.util.*;

class PalindromeString_25{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1 = sc.nextLine();
		
		s1 = s1.toLowerCase();
		String s2 = "";
		for(int i = s1.length()-1; i >= 0; i--){
			
			s2 = s2+s1.charAt(i);
			
		}
		
		if(s2.equals(s1)){
			
			System.out.println("String is palindrome");
		}
		
		else{
			
			System.out.println("String is not palindrome");
		}
	}
}