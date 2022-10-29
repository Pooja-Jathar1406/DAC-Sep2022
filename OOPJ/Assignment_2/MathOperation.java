//Assignment  2 , Q.7
/*
7.Create a class MathOperation that has four static methods. add() method that takes two integer numbers as
parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and
returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the
product. power() method that takes two integer numbers as parameter and returns the power of first number to
second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four
methods of MathOperation class by providing entered numbers and prints the return values of every method.
*/

import java.util.Scanner;
class MathOperation{
	
	//************** Addition *************
	static int add(int a, int b){
		int sum = a+b;
		return sum;
	}
	//************** Subtraction *************
	static int subtract(int a, int b){
		int sub = a-b;
		return sub;
	}
	//************** Multiplication *************
	static int multiply(int a, int b){
		int mul = a*b;
		return mul;
	}
	//************** Power *************
	static double power(int a, int b){
		double pow= Math.pow(a,b);
		return pow;
	}
}
class Demo{
	public static void main(String args[]){
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter first number: ");
		int a= sc.nextInt();
		
		System.out.println("Enter second number: ");
		int b= sc.nextInt();
		
		System.out.println("Sum is: "+MathOperation.add(a,b));
		System.out.println("Subtraction is: "+MathOperation.subtract(a,b));
		System.out.println("Multiplication  is: "+MathOperation.multiply(a,b));
		System.out.println("Power is: "+MathOperation.power(a,b));
	}
}