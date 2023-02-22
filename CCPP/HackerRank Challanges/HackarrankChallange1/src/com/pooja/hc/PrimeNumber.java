package com.pooja.hc;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrimeNumber {
   public static void main(String args[] ) throws Exception {
       /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		int N=100;
		int arr[] = new int[N];
        
       for(int i=1; i<N; i++){
          
           for(int j=2; j<N; j++){
               
               if(i%j==0){
                   continue;
               }
               else{
                   arr[i-1]=i;
               }
           } 
       }
       System.out.println("Prime number series ");
       for(int a=0; a<N;a++){
           System.out.println(arr[a]);
       }
       System.out.println("Enter the position: ");
       Scanner sc = new Scanner(System.in);
       int pos=sc.nextInt();
       System.out.println(arr[pos-1]+" "+arr[pos]+" "+arr[pos+1]);
   }
}