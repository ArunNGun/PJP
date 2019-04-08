class Assignment2{
	public static void main(String... s){
	
		int[] array ={3,2,1,5,4};
		int sum=0;
		for(int i=0;i<array.length;i++){
			for(int j=0;j<i;j++)
			{
				if(array[j]>array[j+1]){
					int temp= array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println("maximum:"+array[array.length-1]+"\nminimum:"+array[0]);
}	
}
