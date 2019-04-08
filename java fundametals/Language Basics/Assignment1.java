class Assignment1{
	public static void main(String... s){
		if(s.length!=2){
			System.out.println("this program accepts only two arguments");
			System.exit(0);
		}
		System.out.println(s[0]+" Technologies "+s[1]);
	}
}