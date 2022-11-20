/*
Q  21. Write a Java program to remove all the elements from a priority queue
*/

import java.lang.*;
import java.util.*;

class RemoveElementsFromPriorityQueue_21{
	
	public static void main(String args[]){
		
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		
		pq1.add("Red");
		pq1.add("Blue");
		pq1.add("Orange");
		pq1.add("Yellow");
		pq1.add("Pink");
		pq1.add("Black");
		pq1.add("Brown");
		pq1.add("White");
		
		System.out.println("Elements in the priority queue are : ");
		for(String x : pq1){
			
			System.out.print(x+" ");
		}
		
		pq1.clear();
		
		System.out.println();
		System.out.println("Priority queue after removing all elements : ");
		for(String x : pq1){
			
			System.out.print(x+" ");
		}
		
	}
}