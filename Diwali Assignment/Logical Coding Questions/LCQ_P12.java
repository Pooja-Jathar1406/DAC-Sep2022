//*******  LCQ_P12

import java.lang.*;
import java.util.*;

class LCQ_P12{
	
	public static void main(String args[]){
		
		for(int i = 1; i<= 6; i++){
			
			for(int j = i; j <= 6; j++){
				
				System.out.print(" ");
			}
			
			int alpha = 65;
			
			for(int j = 1; j <= i; j++){
				
				System.out.print((char)alpha+" ");
				alpha++;
			}
			
			System.out.println();
		}
	}
}
/*
      A
     A B
    A B C
   A B C D
  A B C D E
 A B C D E F
*/