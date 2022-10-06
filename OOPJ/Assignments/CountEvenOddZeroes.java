import java.util.*;

class CountEvenOddZeroes{
	public static void main(String args[]){
		int countEven =0;
		int countOdd = 0;
		int countZeros= 0;
		//-----take size of array------
		System.out.println("Enter the number of elements you want to store in array : ");
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		
		//----------take array elements-------
		int arr[]=new int[n];
		System.out.println("Enter the array elements : ");
		Scanner sc2=new Scanner(System.in);
		for(int i=0; i<n; i++){
			arr[i]=sc2.nextInt();
		}
		
		//----------check and print if even numbers-----------
		System.out.println("Even numbers in given array : ");
		for(int j=0; j<arr.length;j++){
			if(arr[j]%2==0){
				System.out.println(arr[j]);
			    countEven+=1;
			}
		 }
		 System.out.println("Total Even numbers in given array : " +countEven);
		 
		//----------check and print if odd numbers-----------
		System.out.println("Odd numbers in given array : ");
		for(int k=0; k<arr.length;k++){
			if(arr[k]%2!=0){
				System.out.println(arr[k]);
			    countOdd++;
			}
		 }
		 System.out.println("Total Odd numbers in given array : " +countOdd);
		 
		//System.out.println("Zeros in given array : ");
		for(int l=0; l<arr.length;l++){
			if(arr[l]==0)
			countZeros++;
		    }
		 System.out.println("Total number of Zeros  in given array : " +countZeros);
	}
}
/* 
o/p :
Enter the number of elements you want to store in array :
5
Enter the array elements :
3
56
0
23
4
Even numbers in given array :
56
0
4
Odd numbers in given array :
3
23
Zeros in given array :
0
*/