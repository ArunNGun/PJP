class Assignment16{
	public static void main(String... s){
		
		if(s.length==0){
			System.out.println("Please enter an integer number");
			System.exit(0);
		}

		int input = Integer.parseInt(s[0]);
		for (int i=1;i<=input;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();	
		}
		
}	
}
