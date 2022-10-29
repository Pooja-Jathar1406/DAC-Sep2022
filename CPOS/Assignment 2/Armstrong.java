import java.util.Scanner;
class Armstrong{
	public static void main(String args[]){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int rem;
        int sum=0,count=0;
		//------------count digits--------------
        while(temp!=0){
            temp=temp/10;
            count++;
        }
		//---------calculate sum of power of all digits----------
        temp=n;
        while(temp!=0){
            rem=temp%10;
            sum=sum+(int)(Math.pow(rem,count));
            temp=temp/10; 
        }
		//---------compare sum and num----------
        if(sum==n){
            System.out.println("Given no. is an Armstrong number!");
        }
        else
            System.out.println("Given no. is not an Armstrong number!");
	}
}