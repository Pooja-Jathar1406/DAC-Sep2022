class PrintNums{
	
	public static void main(String args[]){
		int n=20;
		
		System.out.println("--------Using While loop--------- ");
		while(n>=1){
			System.out.print(n+" ");
			n--;
		}
		System.out.println();
		
		System.out.println("--------Using for loop--------- ");
		for(int i=20;i>=1;i--){
			System.out.print(i+" ");
		}
	}
}
