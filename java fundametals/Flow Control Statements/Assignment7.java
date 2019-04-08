class Assignment7{
	public static void main(String... s){
	char character1='E';

		if(character1<122&&character1>=97){
			char character2=Character.toUpperCase(character1);
			System.out.println(character1+"->"+character2);
		}
		
		else{
			char character2=Character.toLowerCase(character1);
			System.out.println(character1+"->"+character2);	
		}
	}
}
