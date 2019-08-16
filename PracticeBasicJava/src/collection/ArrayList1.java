package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String>abc=new ArrayList<>();
		
		abc.add("Steve");
		abc.add("Tim");
		abc.add("Lucy");
		abc.add("Pat");
		abc.add("Angela");
		abc.add("Tom");
		//System.out.print(abc);
		
		
	/*for(String abc1:abc) {
		System.out.print(" "+abc1);
		
		
		
	}*/
	//abc.remove("Tim");
	
	
	Set<String>abc1=new LinkedHashSet<String>(abc);
	abc.clear();
	abc.addAll(abc1);
	System.out.println(abc );
	System.out.println( abc1);
	}
}
	
	


