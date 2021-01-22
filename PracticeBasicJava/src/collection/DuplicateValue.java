package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateValue {

	public boolean duplicateInt(Integer[] num) {
		List<Integer> num1 = new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			System.out.println("Adding " + num[i] + " to num1 arraylist");
			if (num1.contains(num[i])) {
				return true;
			}
			num1.add(num[i]);

		}
		
		return false;
	}

	public void splitName(String name) {
		String daugh = name;
		String[] SPD = daugh.split(" ");
		for (String a : SPD) {
			System.out.println(" name: " + a);
		}
		
		
		List<String> key = new ArrayList<String>();
		key.add("FN");
		key.add("MN");
		key.add("LN");
		List<String> SPName = new ArrayList<String>();
		Map<List<String>,List<String>> map=new HashMap<List<String>,List<String>>();
		SPName=Arrays.asList(SPD);	
		map.put(key, SPName);
		System.out.println(map);
		/*map.put("FN", SPName.get(0));
		map.put("MN", SPName.get(1));
		map.put("LN", SPName.get(2));*/
		
		System.out.println(SPName);
		SPName.set(1,"Fatima");
		System.out.println(SPName);
		
		}

	public static void main(String[] args) {
		String name1 = "Zuairah Noureen Islam";
		DuplicateValue dv = new DuplicateValue();
		dv.splitName(name1);
		
		  Integer[] num = { 2, 3,2, 4, 7, 8 };
		   boolean s1 = dv.duplicateInt(num);
		  System.out.println("Array cointains  duplicate : "+s1);
		 
	}

}
