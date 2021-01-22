package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PracticeClass {

	public static void main(String[] args) {
		ArrayList<String>Cars=new ArrayList<>();
		Cars.add("BMW");
		Cars.add("TOYOTA");
		Cars.add("HONDA");
		Cars.add("FORD");
		System.out.println("print :\n"+Cars);
		
		//Cars.add(0,"MARCIDIS");
		
		Cars.set(0,"RX");
		System.out.println("print :\n"+Cars);
		
		Collections.sort(Cars);
		System.out.println("print :\n"+Cars);
		System.out.println("print :\n"+Cars.get(2));
		for(String car:Cars) {
			if(car=="BMW") {
				System.out.println("print :"+car);
			}
			else {
				System.out.println("print on element");
			}
		}
		int[]Number= {2,3,5,3,6,7,5,9,6};
		Arrays.sort(Number);
		for(int i=0;i<9;i++) {
			System.out.println();
		}
		
		System.out.println(Number[4]);
		 Number[5]= 8;
		 System.out.println("p :"+Number[5]);
		int len=Number.length;
		//System.out.println(Number.length);
		
		boolean duplicate=false;
		for(int i=0;i<Number.length-1;i++) {
			if(Number[i]==Number[i+1]) {
				continue;
			}
			System.out.println("print :"+Number[i]);
			if(duplicate) {
				continue;
			}
		}
		
		
		
	}

}
