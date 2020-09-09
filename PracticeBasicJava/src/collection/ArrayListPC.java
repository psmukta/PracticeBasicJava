package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPC {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("1223");
		list.add("234");
		list.add("456");
		
		
		//System.out.println(newlist);
		list.add(1,"aaaaaab");
		//System.out.println(list);
		String LSt="765";
		list.set(1, "LSt");
		int newlist=list.size();
		System.out.println(list);
		
		/*for(int i=0;i<newlist;i++) {
			System.out.println(list.get(i));
			
		}*/
		Iterator p=list.listIterator();
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		

	}

}
