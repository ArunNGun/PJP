class Assignment2{
	public static void main(String... s){
		if(s.length==0){
			System.out.println("please enter a integer through command line");
			System.exit(0);
		}
		int argument =Integer.parseInt(s[0]);
		if(argument%2==0){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
	}
}