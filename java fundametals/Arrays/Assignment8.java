class Assignment8{
	public static void main(String... s){
		int[] array={10,3,6,1,2,7,9};
		int index1=-1;
		int index2=-1;
		int sum=0;
		int flag=0;
		for(int i=0;i<array.length;i++){
			if(array[i]==6){
				index1=i;
				flag=1;
			}
			if(array[i]==7)
				index2=i;

		}
		
		if(index1<index2 && flag==1)
		{
			for(int i=0;i<index1;i++)
				sum+=array[i];

			
			for(int i=index2+1;i<array.length;i++)
				sum+=array[i];
		}
		else
			for(int i=0;i<array.length;i++)
				sum+=array[i];

		System.out.println(sum);
	}

}