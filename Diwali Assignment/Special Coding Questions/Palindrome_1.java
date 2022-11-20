/*
1. Note: a palindrome is a sequence of characters that reads the same forwards and backwards.
Ex: Given the following strings...
"A man, a plan, a canal: Panama.", return true
*/

import java.util.Scanner;

class Palindrome_1{
	
	public static void main(String args[])
	{
		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		 
		String str = s.replaceAll("[^a-zA-Z]","");
		str = str.toLowerCase();
		String s1 = "";
		for(int i = str.length()-1; i >= 0;  i--){
			s1 = s1 + str.charAt(i);
		}
		if(str.equals(s1)){
			System.out.println("String is palindrome");
		}
		else{
			System.out.println("String is not palindrome");
		}
	}
}