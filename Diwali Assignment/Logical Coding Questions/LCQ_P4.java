//*******  LCQ_P4

import java.lang.*;
import java.util.*;

class LCQ_P4{
	
	public static void main(String args[]){
		
		int num = 1;
		int x = 5;
		
		for(int i = 0; i < 5; i++){
			
			for(int j = 1; j <=x; j++){
				
				System.out.print(" ");
			}
			
			num = 1;
			
			for(int j = 0; j <= i; j++){
				
				System.out.print(num+" ");
				num = num *(i-j)/(j+1);
			}
			x--;
			System.out.println();
			
		}
	}
}
/*
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
*/