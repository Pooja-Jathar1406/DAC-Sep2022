/*
14. How to reverse words in a sentence without using a library method?
*/
import java.lang.*;
import java.util.*;

class ReverseTheWords_14{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String s = sc.nextLine();
		
		String str[] = s.split(" ");
		for(int i = str.length-1; i >= 0; i--){
			
			System.out.print(str[i]+" ");
		}
	}
}