import java.util.*;
class PercentCategory{
	
	public static void main(String args[]){
		
		System.out.println("Enter Percentages to display category: ");
		Scanner sc=new Scanner(System.in);
		double p= sc.nextDouble();
		int ch=(p>=80&&p<=100)?1:((p>=60&&p<80)?2:(p>=50&&p<60)?3:4);
		
		switch(ch){
			case 1:
			System.out.println("You got Distinction!!");
			break;
			case 2:
			System.out.println("You got First class!!");
			break;
			case 3:
			System.out.println("You got Second class!!");
			break;
			case 4:
			System.out.println("You Failed!!");
			break;
			default:
			System.out.println("Please Enter valid percentage.");
		}
		
	}
}