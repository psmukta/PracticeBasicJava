package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapToArrayListConversion {

	public static void main(String[] args) {
		Map<String,String>ccap=new HashMap<String,String>();
		ccap.put("Bangladesh","Dhaka");
		ccap.put("USA","DC");
		ccap.put("India","Delhi");
		List<String>key=new ArrayList<String>(ccap.keySet());
		for(String country:key) {
			System.out.println(country);
		}
		
		List<String>value=new ArrayList<String>(ccap.values());
		for(String cap: value) {
			System.out.println(cap);
		}
		//Creating  ArrayList from Entry set
		ArrayList<Entry<String,String>>entry=new ArrayList<Entry<String,String>>(ccap.entrySet());
		for(Entry<String,String>entryset:entry) {
			System.out.println("Country:  and  Capital: "+ entryset.getKey() +" : "
		    +entryset.getValue());
			
		}
		

	}

}
