class Assignment14{
	public static void main(String... s){
	if(s.length==0){
		System.out.println("Please enter an integer number");
		System.exit(0);
	}

	int input=Integer.parseInt(s[0]);
	if(input==0){
		System.out.println("0 is neither prime nor composite");
	}
	else if(input==1){
		System.out.println("1 is neither prime nor composite");
	}
	else{
		for(int i=2;i<input/2;i++)
		{
			if(input%i==0){
				System.out.println(input+" is not prime a prime number");
				System.exit(0);
			}
		}
	System.out.println(input+" is a prime number");
	}
}	
}
