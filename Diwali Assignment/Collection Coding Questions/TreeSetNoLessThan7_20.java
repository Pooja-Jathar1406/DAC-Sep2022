/*
Q  20. Write a Java program to find the numbers less than 7 in a tree set.
*/
import java.lang.*;
import java.util.*;

class TreeSetNoLessThan7_20{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		TreeSet<Integer> s1 = new TreeSet<Integer>();
		s1.add(10);
		s1.add(4);
		s1.add(2);
		s1.add(35);
		s1.add(7);
		s1.add(1);
		s1.add(45);
		s1.add(5);
		
	
		System.out.println("Elements in the TreeSet are : ");
		for(Integer x : s1){
			
			System.out.println(x);
			
		}
		
		
		System.out.println("Elements in the TreeSet less than 7 are : ");
		
		for(Integer s : s1){
			
			if(s < 7){
				
				System.out.println(s);
			}
		}
		
		
		
	}
}