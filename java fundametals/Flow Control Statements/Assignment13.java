class Assignment13{

	public static void main(String... s){
		int flag;
	for(int i=10;i<=99;i++)
	{
		flag=0;
		for(int j=2;j<=i/2;j++){
			if(i%j==0){
				flag++;
				break;
			}
		}
		if(flag==0)
		{
			System.out.print(i+" ");
		}	
	}
	
	}
}
