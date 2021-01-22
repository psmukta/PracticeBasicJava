package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedArrayList {

	public static void main(String[] args) {
		LinkedList<String>abc=new LinkedList<>();
		
		abc.add("Steve");
		abc.add("Tim");
		abc.add("Lucy");
		abc.add("Pat");
		abc.add("Angela");
		abc.add("Tom");
		System.out.println( "abc list : "+abc);
	/*for(String abc1:abc) {
		System.out.print(" "+abc1);*/
		for(int i=abc.size()-1;i>0;i--) {
			System.out.println("RL"+i+" :"+ abc.get(i));
	}
	abc.addFirst("pat");
	abc.addLast("moo");
	
	String fa=abc.getFirst();
	System.out.println("fa  :"+fa);
	abc.pop();
	System.out.println( "pop : "+abc);
	abc.pollFirst();
	System.out.println( "rev list : "+abc);
	
	Set<String>abc1=new LinkedHashSet<String>(abc);
	abc.clear();
	abc.addAll(abc1);
	//System.out.println(abc );
	//System.out.println( abc1);
	}
}
	
	


