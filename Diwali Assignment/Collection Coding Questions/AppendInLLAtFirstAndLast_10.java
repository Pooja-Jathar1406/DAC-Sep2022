/*
Q 10. Write a Java program to insert elements into the linked list at the first and last position.
*/
import java.lang.*;
import java.util.*;

class AppendInLLAtFirstAndLast_10{
	
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
		System.out.println("Enter the element you want to add at the first : ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter the element you want to add at the end : ");
		String s2 = sc.nextLine();
		
		l1.add(0, s1);
		l1.add(l1.size(), s2);
		
		System.out.println("Linked list after appending elements : ");
		for(String x : l1){
			
			System.out.print(x+" ");
		}
		
	}
}