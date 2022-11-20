//*******  LCQ_P10

import java.lang.*;
import java.util.*;

class LCQ_P10{
	
	public static void main(String args[]){
		
		int alpha = 65;
		for(int i = 1; i <= 6; i++){
			
			for(int j = 1; j <= i; j++){
				
				System.out.print((char)alpha+" ");
			}
			
			System.out.println();
			alpha++;
			
		}
	}
}
/*
A
B B
C C C
D D D D
E E E E E
F F F F F F
*/