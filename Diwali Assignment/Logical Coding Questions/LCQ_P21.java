//*******  LCQ_P21

import java.lang.*;
import java.util.*;

class LCQ_P21{
	
	public static void main(String args[]){
		
		for(int i = 1; i <= 7; i++){
			
			for(int j = 1; j <= i; j++){
				
				if(j == 2 || j == 4 || j == 6){
					
					System.out.print("0 ");
					
				}
				
				else{
					
					System.out.print("1 ");
				}
			}
			
			System.out.println();
		}
	}
}
/*
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1
1 0 1 0 1 0
1 0 1 0 1 0 1
*/