class Box{

	double width;
	double height;
	double depth;

	Box(double width,double height,double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;

	}

	double volume(){
		return width*height*depth;
	}

	public static void main(String... s){

		Box object1=new Box(4,4,4);
		System.out.println(object1.volume());
	}
}