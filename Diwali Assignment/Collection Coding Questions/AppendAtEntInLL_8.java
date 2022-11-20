/*
Q 8. Write a Java program to append the specified element to the end of a linked list.
*/
import java.lang.*;
import java.util.*;

class AppendAtEntInLL_8{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList<String> l1 = new LinkedList<String>();
		
		l1.add("Red");
		l1.add("Blue");
		l1.add("Black");
		l1.add("Brown");
		l1.add("Yellow");
		l1.add("Orange");
		
		System.out.println("Original linked list is : ");
		for(String x : l1){
			
			System.out.print(x+" ");
		}
		
		System.out.println();
		System.out.println("Enter the element you want to add at the end : ");
		String s = sc.nextLine();
		
		l1.add(l1.size(), s);
		
		System.out.println("Linked list after appending element at the end : ");
		for(String x : l1){
			
			System.out.print(x+" ");
		}
		
	}
}