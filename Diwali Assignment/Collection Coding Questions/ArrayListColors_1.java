/*
Q1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
*/

import java.lang.*;
import java.util.*;

class ArrayListColors_1{
	
	public static void main(String args[]){
		
		ArrayList<String> l1 = new ArrayList<String>();
		
		l1.add("Red");
		l1.add("Blue");
		l1.add("Black");
		l1.add("Brown");
		l1.add("Yellow");
		l1.add("Orange");
		
		for(String x : l1){
			
			System.out.println(x);
		}
		
	}
}