class Assignment17{
	public static void main(String... s){
	
		int input = Integer.parseInt(s[0]);
		int reversed=0;
		while(input!=0){
			int temp=input%10;
			reversed=reversed*10+temp;
			input/=10;
		}
		System.out.println(reversed);

}	
}
