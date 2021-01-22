package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetPC {

	public static void main(String[] args) {
		Set<String> H_set=new HashSet<>();
		H_set.add("1223");
		H_set.add("234");
		H_set.add("456");
		
		
		//System.out.println(H_set);
		H_set.add("aaaaaab");
		//System.out.println(list);
		String LSt="765";
	
		H_set.add(LSt);
		int newlist=H_set.size();
		System.out.println("H_set :"+H_set);
		
		/*for(int i=0;i<newlist;i++) {
			System.out.println(H_set.get(i));
			
		}*/
		Iterator p=H_set.iterator();
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		boolean em=H_set.isEmpty();
		
		System.out.println(em);
		if (em==true) {
			System.out.println("set is empty");
			
		}
		else {
			System.out.println("not empty");
		}
		Set<String>hset=(Set<String>)(((HashSet<String>) H_set)).clone();
		System.out.println(hset);
		String[] arr=new String[hset.size()];
		hset.toArray(arr);
		for(String arr1: arr) {
			System.out.println("1  :" +arr1);
		}
		hset.add("xyz");
		hset.add("lmn");
		
		//for compare two sets, set size should be same.
		System.out.println("hset1 :"+hset);
		/*Set<String>set3=new HashSet<String>();
		
		for(String temp:H_set) {
			set3.add(hset.contains(temp) ?  "yes":"no");
			System.out.println("set3 :"+set3);
		}*/
		hset.retainAll(H_set);//matching value of two set
		System.out.println("retain :"+hset);
		
		
	}

}
