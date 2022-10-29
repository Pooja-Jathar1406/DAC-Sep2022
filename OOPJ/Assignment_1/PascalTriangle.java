import java.util.*;
public class PascalTriangle   
{  
	static int fact(int n){
	   int f;
	   for(f=1;n>1;n--){
			f=f*n;
	    }
		return f;
	}
	static int ncr(int n, int r){
		int ncr= fact(n)/(fact(n-r)*fact(r));
		return ncr;
	}
    public static void main(String[] args)   
  {  
	   System.out.println("Enter number of rows for pascals triangle : ");
	   Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
        int  i,j;
		for(i=0;i<=n;i++){
			for (j=0;j<=n-i;j++){
				System.out.print("  ");
			}
			for (j=0;j<=i;j++){
				System.out.print("   "+ncr(i,j));
			}
			System.out.println();
		}	
    } 
 }  

