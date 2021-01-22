package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinDiffList {
	public static  int minDiff(List<Integer> arr) {
		
		List<Integer>newList=new  ArrayList<Integer>();
		newList.addAll(arr);
		Collections.sort(newList);
		System.out.println("elements: "+newList);
		List<Integer>sumList=new  ArrayList<Integer>();
		for(int i=0;i<sumList.size()-1;i++) {
			int diff=newList.get(i+1)-newList.get(i);
			
			if(diff<0) {
				diff=0-diff;
			}
			sumList.add(diff);
			
		}
		System.out.println("sumeL: "+sumList);
		int sum=0;
		for(int i:sumList) {
			sum+=i;
		}
	    System.out.println("sum: "+sum);
		return sum;		
	}
	
	
	public static void main (String[]args) {
		
	List<Integer>Li=new ArrayList<Integer>();
	Li.add(2);
	Li.add(3);
	Li.add(5);
	Li.add(2);
	Li.add(0);
	Li.add(1);
	
		MinDiffList MDF=new MinDiffList();
		MDF.minDiff(Li);
	
	}

}
