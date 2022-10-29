import java.util.*;
class TempConv{
	public static void main(String args[]){
		System.out.println("Enter temerature in farenheit: ");
		Scanner sc=new Scanner(System.in);
		float f=sc.nextFloat();
		
		float c= 5*(f-32)/9 ;
		System.out.println("Temperature in Degree Celcius is: "+c+"deg C");
	}
}