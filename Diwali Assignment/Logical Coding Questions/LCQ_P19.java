//*******  LCQ_P19

import java.lang.*;
import java.util.*;

class LCQ_P19{
	
	public static void main(String args[]){
		
		for(int i = 1; i <= 7; i++){
			int x = 7;
			for(int j = 1; j <= i; j++){
			
				System.out.print(x+" ");
				x--;
			}
			
			System.out.println();
		}
	}
}
/*
7
7 6
7 6 5
7 6 5 4
7 6 5 4 3
7 6 5 4 3 2
7 6 5 4 3 2 1
*/