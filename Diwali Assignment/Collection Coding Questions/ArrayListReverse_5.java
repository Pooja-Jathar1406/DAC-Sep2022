/*
Q 5. Write a Java program to reverse elements in a array list.
*/

import java.lang.*;
import java.util.*;

class ArrayListReverse_5{
	
	public static void main(String args[]){
	
		ArrayList<String> l1 = new ArrayList<String>();
		
		l1.add("Red");
		l1.add("Blue");
		l1.add("Black");
		l1.add("Brown");
		l1.add("Yellow");
		l1.add("Orange");
		
		System.out.println("Original array list is : ");
		for(String x : l1){
			
			System.out.print(x+" ");
		}
		
		Collections.reverse(l1);
		System.out.println();
		System.out.println("Array list after reversing  : ");
		for(String x : l1){
			
			System.out.print(x+" ");
		}
		
	}
}