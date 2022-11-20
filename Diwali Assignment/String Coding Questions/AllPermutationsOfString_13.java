/*
13. How to find all permutations of String?
*/
import java.lang.*;
import java.util.*;

class AllPermutationsOfString_13{
	
	public static void printPermutations(String given, String ans){
		
		if(given.length() == 0){
			System.out.println(ans+" ");
			return;
		}
		
		for(int i = 0; i < given.length(); i++){
			
			char ch = given.charAt(i);
			String res = given.substring(0, i) + given.substring(i+1);
			printPermutations(res, ans+ch);
		}
		
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		System.out.println("All possible permutations are : ");
		printPermutations(s, "");
		
	}
}