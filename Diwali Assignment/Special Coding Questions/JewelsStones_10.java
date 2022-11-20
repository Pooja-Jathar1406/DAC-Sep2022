/*
Q10. Given a string representing your stones and another string representing a list of jewels, return the number of stones that you have that are also jewels.
Ex: Given the following jewels and stones...
jewels = "abc", stones = "ac", return 2
jewels = "Af", stones = "AaaddfFf", return 3
jewels = "AYOPD", stones = "ayopd", return 0
*/
import java.lang.*;
import java.util.*;

class JewelsStones_10{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the jewels : ");
		String k = sc.nextLine();
		
		System.out.println("Enter the stones : ");
		String s = sc.nextLine();
		
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			for(int j = 0; j < k.length(); j++){
				if(s.charAt(i) == k.charAt(j)){
					count++;
					
				}	
			}
		}
		
		System.out.println(count);
	}
}