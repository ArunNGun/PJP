class Assignment6{
	public static void main(String... s){

		int age=Integer.parseInt(s[1]);
		
		if(s[0].equals("Female")){
			if(age>=0&&age<=58)
				System.out.println("the percentage of interest is 8.2%");
			else if(age>=59&&age<=100)
				System.out.println("the percentage of interest is 9.2%");
			else
			System.out.println("wrong input! Please enter Gender and then Age");				
		}
		else if(s[0].equals("Male")){
			if(age>=1&&age<=58)
				System.out.println("the percentage of interest is 8.4%");
			else if(age>=59&&age<=100)
				System.out.println("the percentage of interest is 10.5%");
			else
			System.out.println("wrong input! Please enter Gender and then Age");
		}

		else
			System.out.println("wrong input! Please enter Gender and then Age");
			
	}
}
