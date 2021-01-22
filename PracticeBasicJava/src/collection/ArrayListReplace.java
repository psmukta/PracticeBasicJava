package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListReplace {

	public static void main(String[] args) {
		ArrayList<String>colorlist=new ArrayList<>();
		colorlist.add("red");
		colorlist.add("green");
		colorlist.add("yellow");
		colorlist.add("blue");
		colorlist.add("white");
		int list=colorlist.size();
		System.out.println(list);
		String newcolor="gray";
		colorlist.set(1, newcolor);
		//print by index
		for(int i=0;i<list;i++) {
			System.out.println(colorlist.get(i));
		}
		Iterator p=colorlist.listIterator(1);
		System.out.println(p.hasNext());
		Iterator q=colorlist.iterator();
		//print from second position
		while(q.hasNext()) {
			System.out.println(q.next());
		}
		
		

	}

}
