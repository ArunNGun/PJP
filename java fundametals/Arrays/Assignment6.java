class Assignment6{
	public static void main(String... s){
		
		int[] array={65,42,31,2,6};
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-i-1;j++){
				if(array[j]>array[j+1]){
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}

			
		}	
		for(int i=0;i<array.length;i++)
				System.out.println(array[i]);	

	}	
}