class Assignment1{
	public static void main(String... s){
		if(s.length==0){
			System.out.println("please enter a integer through command line");
			System.exit(0);
		}
		int argument =Integer.parseInt(s[0]);
		if(argument<0){
			System.out.println("negative");
		}
		else if(argument>0){
			System.out.println("positive");
		}
		else{
			System.out.println("zero");
		}
	}
}