class Assignment3{
	public static void main(String... s){
		int target = Integer.parseInt(s[0]);
		int[] array ={1,4,34,56,7};
		int flag=0;

		for(int i=0;i<array.length;i++){
			if(target==array[i])
			{
				System.out.println(i);
				flag=1;
				break;
			}
		}
		if(flag==0){
		System.out.println("-1");
}		}
}
