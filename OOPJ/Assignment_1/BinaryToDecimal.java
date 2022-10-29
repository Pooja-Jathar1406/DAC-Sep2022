import java.util.Scanner;
class BinaryToDecimal{
	
	static int decimal(int num){
		int dec = 0;  
		int n = 0; 
		while(true){  
           if(num == 0){  
             break;  
            } 
	       else { 
				int temp = num%10;  
				dec += temp*Math.pow(2, n);  
				num = num/10;  
				n++;  
			}
	    }
		return dec;
	}
		
    public static void main(String agrs[]){  
	   // System.out.println("Input binary number: ");
		//Scanner sc = new Scanner(System.in);
		//String binaryString=sc.next();  
		//int decimal=Integer.parseInt(binaryString,2);  
		//System.out.println("Decimal is : "+decimal);  
		
		System.out.println("Input binary number: ");
		Scanner s = new Scanner(System.in);
		int binaryNum=s.nextInt();  
		
		System.out.println("Decimal is "+decimal(binaryNum));   
		
		
	}
	 
}