class Calculator{
	


	static int powerInt(int num1,int num2){
		return (int)Math.pow(num1,num2);
	}

	static double powerDouble(double num1,int num2){
		return Math.pow(num1,num2);
	}

	public static void main(String... s){

		System.out.println(powerInt(2,4));
		System.out.println(powerDouble(1.5,2));
	}
}