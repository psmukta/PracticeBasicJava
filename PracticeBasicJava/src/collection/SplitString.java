package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SplitString {

	public String split(String s) {
		String sa = s;
		String[] spt = sa.split(" ");
		for(String a:spt) {
			System.out.println(a);
		}
		String x = spt[0];
		System.out.println(x);
		List<String>l1=new ArrayList<String>();
		l1=Arrays.asList(spt);
		System.out.println(l1);
		Collections.reverse(l1);
		System.out.println(l1);
		/*for(int i=l1.size()-1; i>=0; i--) {
			//System.out.println("reverse :" +l1.get(i));
			List<String>l2=new ArrayList<String>();
			l2.add(l1.get(i));
			System.out.println(l2);
			for(int i1=0;i1<l2.size();i1++) {
				System.out.println("reverse :" +l2.get(i1));
			}
		}*/
		
		return s;
	}

	public static void main(String[] args) {
		SplitString ss = new SplitString();
		String s = "I love you";
		ss.split(s);
		

	}

}
