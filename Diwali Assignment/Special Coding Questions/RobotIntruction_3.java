/*
Q3. This question is asked by Amazon. Given a string representing the sequence of moves a 
robot vacuum makes, return whether or not it will return to its original position. The string will only 
contain L, R, U, and D characters, representing left, right, up, and down respectively.
Ex: Given the following strings...
"LR", return true
"URURD", return false
"RUULLDRD", return true
*/

import java.lang.*;
import java.util.*;

class RobotIntruction_3{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		char ch[] = s.toCharArray();
		
		int Lcount = 0;
		int Rcount = 0;
		int Dcount = 0;
		int Ucount = 0;
		
		for(int i = 0; i < ch.length; i++){
			
			if(ch[i] == 'L'){
				
				Lcount++;
				
			}
			else if(ch[i] == 'R'){
				
				Rcount++;
				
			}
			
			else if(ch[i] == 'D'){
				
				Dcount++;
				
			}
			else if(ch[i] == 'U'){
				
				Ucount++;
				
			}
		}
		
		if(Lcount == Rcount && Dcount == Ucount){
			
			System.out.println("Robot will return to its original position");
			
		}
		
		else{
			
			System.out.println("Robot will not return to its original position");
		}
	}
}