package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListPractice {
	public static void main(String[] arg) {
		List<String> L1 = new ArrayList<String>();
		L1.add("red");
		L1.add("blue");
		L1.add("red");
		L1.add("white");
		L1.add("black");
		L1.add("green");
		L1.add("black");
		// clone
		List<String> cl = (List<String>) (((ArrayList<String>) L1).clone());
		System.out.println("cl :" + cl);
		for (int i = 0; i < L1.size(); i++) {
			System.out.println(" color_index" + i + " " + L1.get(i));
		}
		// cl.clear();
		/*
		 * int sz=cl.size(); System.out.println("sz :"+cl.isEmpty());
		 * System.out.println("clr :"+cl);
		 */
		cl.stream();

		System.out.println("strm :" + cl);
		// Print the list
		System.out.println("Color list :" + L1);
		int countred = Collections.frequency(L1, "red");
		System.out.println(countred);
		for (int i = 0; i < L1.size(); i++) {
			String C = L1.get(i);
			System.out.println("List " + i + " " + C + "  " + Collections.frequency(L1, C));
		}
		Collections.shuffle(L1);
		System.out.println("L1 => " + L1);
		List<String> sb = new ArrayList<String>();
		System.out.println("sb => " + L1.subList(3, 6));
		List<String> M1 = new ArrayList<String>();
		M1.add("a");
		M1.add("b");
		M1.add("r");
		M1.add("w");
		M1.add("b");
		M1.add("g");
		M1.add("b");
		List<String> add = new ArrayList<String>();
		add.addAll(L1);
		add.addAll(M1);
		System.out.println("add==> " + add);
		List<String> com = new ArrayList<String>();
		for (String e : L1) {
			com.add(M1.contains(e) ? "yes" : "no");
			System.out.println("compare :" + com);
		}
		Collections.copy(M1, L1); // copy will work when both collections are not empty.
		M1.addAll(L1);
		System.out.println("M1 => " + M1);
		// iterate list
		/*
		 * for(String a:L1) { System.out.println("Color list :"+a);
		 */
		// }
		for (int i = 0; i < L1.size(); i++) {
			String X = L1.get(i);
			System.out.println("Color " + i + " :" + X);
		}
		// add item in first position
		L1.add(0, "orange");
		L1.add(4, "gray");
		// System.out.println("Color list :"+L1);
		// System.out.println("Color 5 :"+L1.get(4));
		L1.set(2, "red");
		L1.set(3, "blue");
		System.out.println("Color list :" + L1);
		Collections.sort(L1);
		System.out.println("Color list :" + L1);
		Collections.reverse(L1);
		System.out.println("Color list :" + L1);
		// Swapping 1st(index 0) element with the 3rd(index 2) element
		Collections.swap(L1, 1, 5);
		System.out.println("Color list :" + L1);
		for (String sw : L1) {
			System.out.println("Swap list :" + sw);
		}
		L1.remove(0);
		System.out.println(L1);
		if (L1.contains("red")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		Set<String> L2 = new HashSet<String>();
		L2.addAll(L1);
		System.out.println(L2);
		int S = L1.size();
		int S1 = L2.size();
		if (S != S1) {
			System.out.println("duplicate");
		} else {
			System.out.println("no duplicate");
		}
	}

}
