package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Practice1 {
	public static void main(String[] arg) {
		ArrayList<String>list=new ArrayList<>();
		list.add("red");
		list.add("blue");
		list.add("gray");
		Collections.sort(list);
		System.out.println("Print:"+list);
		
		
		ArrayList<String>list1=new ArrayList<>();
		list1.add("white");
		list1.add("pink");
		System.out.println(list.equals(list1));
		
		ArrayList<String>list2=new ArrayList<>();
		for(String temp:list) {
			list2.add(list1.contains(temp) ? "yes":"no");
			System.out.println("searching for : "+temp+" -> "+list1.contains(temp));
		}
		System.out.println(list2);
		
	}

}
