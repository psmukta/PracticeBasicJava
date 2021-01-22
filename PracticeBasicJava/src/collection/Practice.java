package collection;

public class Practice {

	// Given a non-negative integer num, repeatedly add all its digits
	// until the result has only one digit.

	public int addNumber(int num) {
		int a = num;
		while (a >= 10) {
			int sum = 0;
			while (a > 0) {
				sum = sum + a % 10;
				a = a / 10;
			}
			a = sum;

		}
		System.out.println(a);
		return a;
	}

	public static void main(String[] args) {
		Practice pc = new Practice();
		int num = 123;
		pc.addNumber(num);

	}

}
