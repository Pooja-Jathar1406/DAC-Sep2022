import java.util.*;
class ArrayElement{
    public static void main(String args[]){
		
		//--------Using large and small variable----------
		int a[ ]={3, 5, 1, 9, 6};
		int l=a[0];
		int s=a[0];
		int d=10;
		long e=50;
		d=(int)e;
		
	    for(int i=1; i<a.length; i++){
		    if(a[i]>l){
				l=a[i];
			}
			else if(a[i]<s){
				s=a[i];
			}
	    }
		System.out.println("Smallest element = "+s);
		System.out.println("Largest element = "+l);
		
		//----------Using wrapper classes----------
		Arrays.sort(a);
		System.out.println("Smallest element = "+a[0]);
		System.out.println("Largest element = "+a[a.length-1]);
    }
}