package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
//https://beginnersbook.com/2013/12/hashmap-in-java-with-example/
public class HowToPutTwoArrayListIntoHashMap {
	public static void main(String[]args) {
	
	List<String>l1=new ArrayList<>();
	l1.add("abc");
	l1.add("bcd");
	l1.add("cde");
	
	List<Integer>l2=new ArrayList<>();
	l2.add(1);
	l2.add(2);
	l2.add(3);
	
	Map<List<String>,List<Integer>>map=new HashMap <List<String>, List<Integer>>();
	//Map<List<String>, List<Integer>> fullMap = new HashMap<List<String>, List<Integer>>();
    //fullMap.put(imageFile, musicFile);
	
	//for(int i=0; i<imageFile.size(); i++) {
   // mappedFiles.put(imageFile.get(i), musicFile.get(i));
	
	//map.put(l1, l2);

	System.out.println(map);
	Iterator<Entry<List<String>, List<Integer>>>Itr=map.entrySet().iterator();
	while(Itr.hasNext()) {
		Entry<List<String>, List<Integer>>entry=Itr.next();
		System.out.println("key  :"+entry.getKey()+"\n" +" value :"+ entry.getValue());
	}
	
	
	
	}
}
