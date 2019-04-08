class Assignment3{
	public static void main(String... s){
		if(s.length==0){
			System.out.println("No Values");
			System.exit(0);
		}
		for(int i=0;i<s.length-1;i++){
			System.out.print(s[i]+",");
		}
		System.out.println(s[s.length-1]);
	}
}