package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayListUniqueValue {

	public static void main(String[] args) {
		ArrayList<String>duplicateList=new ArrayList<>() ;
			duplicateList.add("sam");
			duplicateList.add("ram");
			duplicateList.add("sam"); 
			duplicateList.add("mam");
			duplicateList.add("sam");
			System.out.println(duplicateList);
			/*Set<String>uniquelist=new LinkedHashSet<String>(duplicateList);
		
			duplicateList.clear();
			duplicateList.addAll(uniquelist);
			System.out.println("print uniquelist  :"+duplicateList);*/
			ArrayList uniqueList = (ArrayList) duplicateList.stream().distinct().collect(Collectors.toList());
	System.out.println(uniqueList);
	
	}
	
	
	

}
