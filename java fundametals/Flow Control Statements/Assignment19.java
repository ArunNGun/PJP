class Assignment19{
	public static void main(String... s){
		int count=0;
		int i=1;
		while(count<5){
			if(i%2==0&&i%3==0){
				if(i%5==0){
					count++;
					System.out.println(i);
				}
			}
			i++;
		}
		
	}
}