/*
Q11. Given two strings, s and t, merge the two strings together alternating characters starting with s.
Note: If one string is longer than the other, append the remaining characters of the longer string at the end of the merged string.
s = "abc", t = "def", return "adbecf".
*/
import java.lang.*;
import java.util.*;

class MergingTwoString_11{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1 : ");
		String s = sc.nextLine();
		int n1 = s.length();
		
		System.out.println("Enter the string 2 : ");
		String t = sc.nextLine();
		int n2 = t.length();
		
		String res = "";
		
		int i = 0;
		int j = 0;
		
		while(i < n1 && j < n2){
			
			res = res + s.charAt(i++);
			res = res + t.charAt(j++);
			
		}
		
		while(i < n1){
			
			res = res + s.charAt(i++);
			
		}
		
		while(j < n2){
			
			res = res + t.charAt(j++);
		}
		
		System.out.println("String after merging is : "+res);
	}
}