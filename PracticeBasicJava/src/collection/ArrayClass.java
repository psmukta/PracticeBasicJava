package collection;

import java.util.Arrays;
//https://github.com/kdn251/interviews/blob/master/company/adobe/AddDigits.java
public class ArrayClass {

	public static void main(String[] args) {
		int[] Input={9, 5, 6, 3, 1, 10, 0};
		Arrays.sort(Input);
		//int x=Input.length;
		for (int i = 0; i < Input.length; i++) {
			System.out.println(Input[i]);
			};
			
			//Input[0]= 22; 
		
		for(int input:Input){
		System.out.println(input);
	}
		
		System.out.println(Input[6]);
	}

}
