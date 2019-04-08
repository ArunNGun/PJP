import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Assignment7{
	public static void main(String... s){

		int[] array={12,34,12,45,67,89};
		List<Integer> array1=new ArrayList<Integer>();

		for(int i:array){
			if(!array1.contains(i))
				array1.add(i);
		}

		System.out.println(Arrays.toString(array1.toArray()));

		
	}		
}	