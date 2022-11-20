/*
Q13. Given an encoded string, s, return its decoded representation. The string s will be encoded as follows N[letters], 
meaning that the letters should be repeated N times in the decoded representation.
Note: You may assume s always encoded correctly (i.e. correct formatting of brackets, only positive values outside 
the brackets, and always lowercase alphabetical characters inside the brackets).
Ex: Given the following string s…
s = "3[a]2[b]1[c]", return "aaabbc" ("a" is repeated 3 times, "b" is repeated 2 times, and "c" is repeated 1 time)..
*/
import java.lang.*;
import java.util.*;

class EncodedDecodedString_13{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the encoded string : ");
		String s = sc.nextLine();
		
		String ch = s.replaceAll("[^a-zA-Z]", "");
		String num = s.replaceAll("[^0-9]", "");
		
		int x[] = new int[num.length()];
		for(int i = 0; i < x.length; i++){
			
			x[i] = Character.getNumericValue(num.charAt(i));
		}
		
		for(int i = 0; i < ch.length(); i++){
			int k = x[i];
			for(int j = 0; j < k; j++){
				
				System.out.print(ch.charAt(i));
			}
		}
		
	}
}