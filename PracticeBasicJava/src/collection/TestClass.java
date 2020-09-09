package collection;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		String states = "NY, TX, CA, ND";
		//String[] c = states.split(",");
		String[] c= {"NY", "TX"," CA"," ND"};
		int size=c.length;
		System.out.println(size);
		
		List<String>state=new ArrayList<>();
		state.add("ohio");
		state.add("maine");
		state.add("maryland");
		//int size=state.size();

	}

}
