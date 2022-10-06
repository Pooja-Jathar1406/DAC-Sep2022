class FibboCmd{
	
	public static void main(String args[]){
		
		int n=Integer.parseInt(args[0]); 
		int a=0,fibbo=0;
		int b=1;
		System.out.print(b+" ");
		for(int i=1; i<=n;i++){
			fibbo=a+b;
			a=b;
			b=fibbo;
			System.out.println(fibbo+" ");
		}	
	}
}