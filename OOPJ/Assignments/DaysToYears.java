import java.util.*;

class DaysToYears{
	
	public static void main(String args[]){
		
		System.out.println("Enter number of days: ");   // 670
		Scanner sc= new Scanner(System.in);
		int days=sc.nextInt();   //days=670
		
		int y, m, d;
		
		y=days/365;                 //670/365 =  1
		System.out.println("Number of completed years: "+y);
		days=days%365;        //670%365= 311
		
		m=days/30;                 //311/30   10
  		System.out.println("Number of completed months: "+m);
	    days=days%30;         //311%30   =  11
	
		System.out.println("Number of completed months: "+days);
	}
}