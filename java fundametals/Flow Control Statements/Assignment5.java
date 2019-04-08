class Assignment5{
	public static void main(String... s){
	char character1='e';

		if((character1>=65 && character1<=90)||(character1>=97&&character1<=122))
			System.out.println("Alphabhet");
		else if(character1>=48 && character1<=57)
			System.out.println("Digit");
		else
			System.out.println("Special Character");
		
	}
}
