class Patient{
	String patientName;
	double height;
	double weight;

	Patient(String patientName,double height,double weight){
		this.patientName=patientName;
		this.height=height;
		this.weight=weight;
	}
	double computeBMI(){
		return weight/(height*height);
	}

	public static void main(String... s){
		Patient object1=new Patient("BOB",173,69);
		System.out.println(object1.computeBMI());
	}

}