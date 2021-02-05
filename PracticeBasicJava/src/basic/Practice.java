package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

import collection.ArrayListClass;

public class Practice {
	public static void main(String arg[]) {
		int x=10;
		if(x==10) {
			//System.out.println("Integer");
		}

		else if(x==5) {
			//System.out.println("not Integer");

		}
		else {
			//System.out.println("nothing");
		}


		/*for(int i=1;i<=5;i++) {
			System.out.println(i);
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}

		}
		for(int i = 5;i>=1;i--) {
			System.out.println(i);
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
		} */
		
		
		
List<String> ls1=new ArrayList<>();
		
		ls1.add("abc");
		ls1.add("acd");
		ls1.add("bca");
		ls1.add("efg");
		ls1.add("cda");
		List<Integer> ls2=new ArrayList<>();
		ls2.add(1);
		ls2.add(2);
		ls2.add(3);
		ls2.add(4);
		ls2.add(5);

		/*
		Map<List<String>,List<Integer>>map=new HashMap <List<String>,List<Integer>>();
		Iterator<Map.Entry<List<String>,List<Integer>>>TR= map.entrySet().iterator();
			while(TR.hasNext()){
				Map.Entry<List<String>,List<Integer>> entry=TR.next();
				System.out.println("k"+entry.getKey() + "v "+entry.getValue());
			}*/
		
		Map<String,Integer>map=new HashMap <String,Integer>();
		map.put("abc", 1);
		map.put("asbc", 2);
		map.put("est", 3);
		
		List<String>l1=new ArrayList<>(map.keySet());
		List<Integer>l2=new ArrayList<>(map.values());
		for(String key:l1) {
			System.out.println(key);	
		}
			for(Integer value:l2) {
				System.out.println(value);
		}
			ArrayList<Entry<String,Integer>>Al=new ArrayList<>();
			for(Entry<String,Integer>entryset:Al) {
				
				
			}
			
			String S1="Good";
			String S2="Morning";
			S1=S1+S2;
			S2=S1.substring(0, S1.length()-S2.length());
			S1=S1.substring(S2.length());
			System.out.println("S1  "+S1);
			System.out.println("S2  "+S2);
		
	}
	}

