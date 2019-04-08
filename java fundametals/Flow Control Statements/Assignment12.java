class Assignment12{
	public static void main(String... s){
	int input=61;

	for(int i=2;i<input/2;i++)
	{
		if(input%i==0){
			System.out.println("not prime");
			System.exit(0);
		}
	}
	System.out.println("prime");
	}
}
