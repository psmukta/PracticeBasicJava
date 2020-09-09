package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExcercise {

	public static void main(String[] args) {
		ArrayList<String>colorlist=new ArrayList<>();
		colorlist.add("red");
		colorlist.add("green");
		colorlist.add("yellow");
		colorlist.add("blue");
		colorlist.add("white");
		//colorlist.add(null);

		System.out.println("print list :"+colorlist);
		Collections.sort(colorlist);
		System.out.println("print sort list : \n"+colorlist);
		
		Collections.reverse(colorlist);
		System.out.println("reverse list :"+colorlist);
		//List<String>sublist=colorlist.subList(0, 3);
		System.out.println("sublist"+colorlist.subList(0, 3));
		/*for(String color:colorlist) { 
			if(color!="red") {
				System.out.println("print :"+color);
				
				//we can do if condition different way
				 if(colorlist.contains("red"){
				  System.out.println("print list :"+colorlist);
				}
				else{
				System.out.println("there is no such element");
				}
			}
		}*/
		colorlist.add(0,"grey");
		colorlist.add(5,"whitegrey");
		System.out.println("print list :"+colorlist);

		/*String Element4=colorlist.get(4);
			System.out.println("print list :"+Element4);*/
		System.out.println("print list :"+colorlist.get(4));
		colorlist.remove(3);
		System.out.println("print list :"+colorlist);
		Collections.swap(colorlist, 3, 4);
		System.out.println("swap :"+colorlist);

	}

}
