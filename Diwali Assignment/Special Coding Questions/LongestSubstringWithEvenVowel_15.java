/*
Q15. Given a string, s, return the length of the longest substring that contains every vowel occurring an even number of times.
Note: You may assume s only contains lowercase alphabetical characters and the vowels you must account for are a, e, i, o, and u.
Ex: Given the following string s…
s = "aeiouaeioua", return 10 (the last 'a' cannot count).
Ex: Given the following string s…
s = "bbb", return 3 (all vowels occur an even number of times, i.e. zero times each).
*/
import java.io.*;
import java.util.*;
 
class LongestSubstringWithEvenVowel_15{
   
	static void longestSubstring(String s){
	
		
		HashMap<String, Integer> indexes = new HashMap<>();
		
		HashMap<Character, Integer> chars = new HashMap<>(){{ 
			put('a', 0);put('e', 1);
			put('i', 2);put('o', 3);
			put('u', 4);
		}} ;
	 
	   
		String evenOdd = "00000";
		indexes.put(evenOdd , -1);
	 
		int length = 0;
	 
	   
		for (int i = 0; i < s.length(); ++i) {
	 
			char c = s.charAt(i);
	 
			
			boolean it = chars.containsKey(c);
	 
			if (it != false) {
				if(evenOdd.charAt(chars.get(c)) == '0'){
					evenOdd = evenOdd.substring(0,chars.get(c)) + '1' + evenOdd.substring(chars.get(c)+1);
				}
				else{
					evenOdd = evenOdd.substring(0,chars.get(c)) + '0' + evenOdd.substring(chars.get(c)+1);
				}
			}
	 
		   
			boolean lastIndex = indexes.containsKey(evenOdd);
	 
			if (lastIndex == false) {
				indexes.put(evenOdd, i);
			}
	 
		   
			else {
				length = Math.max(length, i - indexes.get(evenOdd));
			}
		}
	 
		System.out.println("Longest substring with even no of vowels is : "+length);
	}


	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		
		longestSubstring(str);
	}
}