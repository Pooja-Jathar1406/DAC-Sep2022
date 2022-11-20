//*******  LCQ_P23

import java.lang.*;
import java.util.*;

class LCQ_P23{
	
	public static void main(String args[]){
		
		for(int i = 1; i <= 7; i++){
			
			if(i % 2 != 0){
				
				for(int j = 1; j <= 7; j++){
					
					if(j % 2 != 0){
						
						System.out.print("1 ");
					}
					
					else{
						
						System.out.print("0 ");
					}
				}
			}
			
			else{
				
				for(int j = 1; j <= 7; j++){
					
					if(j % 2 != 0){
						
						System.out.print("0 ");
					}
					
					else{
						
						System.out.print("1 ");
					}
				}
				
			}
			System.out.println();
		}
	}
}
/*
1 0 1 0 1 0 1
0 1 0 1 0 1 0
1 0 1 0 1 0 1
0 1 0 1 0 1 0
1 0 1 0 1 0 1
0 1 0 1 0 1 0
1 0 1 0 1 0 1

*/