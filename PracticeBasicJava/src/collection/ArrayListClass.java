package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListClass {
	
	public static void main(String[] args) {
		List<String> sampleList = new ArrayList<String>();
		sampleList.add("first");
		sampleList.add("second");
		sampleList.add("first");
		sampleList.add("third");
		System.out.println(sampleList.size());
		Set<String> listWithoutDuplicates = new LinkedHashSet<String>(sampleList);
		sampleList.clear();

		sampleList.addAll(listWithoutDuplicates);
	    System.out.println("list without duplicates : " + sampleList);// output[A,B,C]
		System.out.println(sampleList);
		System.out.println(sampleList.get(0));
		System.out.println(sampleList.size());
		sampleList.set(0, "Opel");
		int[] temp= {1, 12, 56, 4, 89, 54, 7, 132, 45};
		oddNumber(temp,3,21);
		
	}
	public static void oddNumber(int[] temp, int l, int r) {
		for(int i=0;i<temp.length;i++) {
			if(temp[i]>=l && temp[i]<=r) {
				if(temp[i]%2!=0) {
					System.out.print(temp[i]+" ");
				}
			}	 
		}
	}

}
