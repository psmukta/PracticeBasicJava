package collection;

import java.util.ArrayList;

public class CompareTwoArrayList {

	public static void main(String[] args) {
		ArrayList<String> al1= new ArrayList<String>();
        al1.add("hi");
        al1.add("How are you");
        al1.add("Good Morning");
        al1.add("bye"); 
        al1.add("Good night");
        ArrayList<String> al2= new ArrayList<String>();
        al2.add("Howdy");
        al2.add("Good Evening"); 
        al2.add("bye");
        al2.add("Good night");
        /*ArrayList<String>al3=new ArrayList<>();
        for(String temp:al1) {
        	al3.add(al2.contains(temp) ? "yes": "no");
        	System.out.println(al3);
        }*/
        System.out.println(al1.equals(al2));
        
        ArrayList<String>al4=new ArrayList<>();
        al4.addAll(al1);
        al4.addAll(al2);
        System.out.println(al4);
        
        }

}
