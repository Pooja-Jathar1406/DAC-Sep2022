class SwapNums3_6 {

	public static void main(String[] args) {

		int a = 10, b = 20;
		// int b = 20;

		System.out.println("Before Swapping " + a + " " + b);

		a = a * b;
		b = a / b;
		a = a / b;

		System.out.println("Before Swapping " + a + " " + b);
	}
}