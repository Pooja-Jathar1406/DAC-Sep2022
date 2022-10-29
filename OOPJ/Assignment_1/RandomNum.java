import java.util.Scanner;
class RandomNum{
	
	public static void main(String args []){
		//-------This will generate a random number between 0.0 to 1.0--------
		System.out.println("1st RandomNum: "+Math.random());
		System.out.println("2nd RandomNum: "+Math.random());
		
		//-------This will generate any random number between specified range--------
		System.out.println("Specify a range to generate random numbers: ");
		Scanner sc = new Scanner(System.in);
		int min= sc.nextInt();
		int max = sc.nextInt();
		
		//-------This will generate any *Int* random number between specified range--------
		int r1=(int)(Math.random()*(max-min+1)+min);
		System.out.println("Random number between "+min+" and "+max+" is : "+r1);
		
        //-------This will generate any *double* random number between specified range--------
		double r2=(double)(Math.random()*(max-min+1)+min);
		System.out.println("Random number between "+min+" and "+max+" is : "+r2);
	}
}

