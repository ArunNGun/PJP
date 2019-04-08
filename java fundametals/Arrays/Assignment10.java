class Assignment10{
	public static void main(String... s){
		if(s.length!=9){
			System.out.println("Please enter 9 integer numbers");
			System.exit(0);
		}

		int[][] array=new int[3][3];
		int k=0;

		System.out.println("The given array is :");
		/*
			I'm converting string argument into array 
			and printing it in the same loop.
		*/
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				array[i][j]=Integer.parseInt(s[k]);
				k++;
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}

		int maxnumber=array[0][0];

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(array[i][j]>maxnumber)
					maxnumber=array[i][j];
			}
		}

		System.out.println("The biggest number in the given array is "+maxnumber);


	}
}		