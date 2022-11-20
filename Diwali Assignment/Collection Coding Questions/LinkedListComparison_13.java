/*
Q 13. Write a Java program to compare two linked lists.
*/
import java.lang.*;
import java.util.*;

class LinkedListComparison_13{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList<String> l1 = new LinkedList<String>();
		
		l1.add("Red");
		l1.add("Blue");
		l1.add("Black");
		l1.add("Brown");
		l1.add("Yellow");
		l1.add("Orange");
		
		System.out.println("linked list 1 is : ");
		for(String x : l1){
			
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		LinkedList<String> l2 = new LinkedList<String>();
		
		l2.add("Red");
		l2.add("Blue");
		l2.add("Black");
		l2.add("Brown");
		l2.add("Yellow");
		l2.add("Orange");
		
		System.out.println("linked list 2 is : ");
		for(String x : l2){
			
			System.out.print(x+" ");
		}
		
		System.out.println();
		if(l1.containsAll(l2)){
			
			System.out.println("Both the linked lists are equal");
		}
		
		else{
			
			System.out.println("Linked lists are not equal");
		}
	}
}