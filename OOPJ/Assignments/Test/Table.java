import java.util.*;
class Table{
	
	public static void main(String args[]){
		
		System.out.println("'Enter a number to write a table : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=n;
		System.out.println("Table of  "+n+": ");
		for(int i=1;i<=10;i++){
			t=t*i;
			System.out.println(n+" x "+i+" = "+t);
			t=n;
		}	
	}
}