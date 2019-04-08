class Assignment5{
	public static void main(String... s){
		
		int[] array={65,42,31,2,6};
		//we can also use Arrays.sort(array); by importing java.util.Arrays;
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-i-1;j++){
				if(array[j]>array[j+1]){
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}

		System.out.println("smallest two numbers are: "+array[0]+" and "+array[1]);
		System.out.println("largest two numbers are: "+array[array.length-2]+" and "+array[array.length-1]);

	}	
}