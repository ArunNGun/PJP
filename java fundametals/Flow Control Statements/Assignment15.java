class Assignment15{
	public static void main(String... s){
	
		int input = Integer.parseInt(s[0]);
		int sum;
		for (sum = 0; input > 0; sum += input % 10,input /= 10);
		System.out.println(sum);
}	
}
