class Assignment9{
	public static void main(String... s){
		if(s.length!=4){
			System.out.println("Please enter 4 integer numbers");
			System.exit(0);
		}

		int[][] array=new int[2][2];
		int k=0;

		System.out.println("The given array is :");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				array[i][j]=Integer.parseInt(s[k]);
				k++;
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("The reverse of the array is :");
		int temp=array[0][0];
		array[0][0]=array[1][1];
		array[1][1]=temp;
		temp=array[0][1];
		array[0][1]=array[1][0];
		array[1][0]=temp;

		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}