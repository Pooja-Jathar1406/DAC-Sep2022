/*
Q 15. Write a Java program to iterate through all elements in a hash list.
*/
import java.lang.*;
import java.util.*;

class HashSetIteration_15{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<String> l1 = new HashSet<String>();
		
		l1.add("Red");
		l1.add("Blue");
		l1.add("Black");
		l1.add("Brown");
		l1.add("Yellow");
		l1.add("Orange");
		
		System.out.println("Hash Set is : ");
		for(String x : l1){
			
			System.out.print(x+" ");
		}
		
		
	}
}