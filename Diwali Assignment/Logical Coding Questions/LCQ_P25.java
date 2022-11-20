//*******  LCQ_P25


import java.lang.*;
import java.util.*;

class LCQ_P25{
	
	public static void main(String args[]){
		
		for(int i = 1; i <= 7; i++){
			
			for(int j = i; j <= 7; j++){
				
				System.out.print(j+" ");
			}
			
			for(int j = 1; j < i; j++){
				
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}
}
/*
1 2 3 4 5 6 7
2 3 4 5 6 7 1
3 4 5 6 7 1 2
4 5 6 7 1 2 3
5 6 7 1 2 3 4
6 7 1 2 3 4 5
7 1 2 3 4 5 6
*/