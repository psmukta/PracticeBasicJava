package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
//https://beginnersbook.com/2013/12/hashmap-in-java-with-example/
public class Iteration {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("apple");
		list.add("grape");
		list.add("fig");
		System.out.println(list.get(2));
		Iterator itr=list.iterator();
		/*while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		ListIterator<String> LIt=list.listIterator();
		while(LIt.hasNext()) {
			System.out.print(LIt.next()+", " );
		}
		System.out.println("\n----------------");
		while(LIt.hasPrevious()) {
			System.out.print(LIt.previous()+ ", ");
		}


	}

}
