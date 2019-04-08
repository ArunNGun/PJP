class Assignment18{
	public static void main(String... s){
	
		int input = Integer.parseInt(s[0]);
		int original=input;
		int reversed=0;
		while(input!=0){
			int temp=input%10;
			reversed=reversed*10+temp;
			input/=10;
		}
		if(original==reversed)
			System.out.println(reversed+" is a palindrome");
		else
			System.out.println(original+" is not a palindrome");

}	
}