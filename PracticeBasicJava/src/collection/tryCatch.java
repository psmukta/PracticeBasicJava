package collection;

public class tryCatch {

	public static void main(String[] args) {
		int a=10,b=5,c=5, result;
		try {
			result=a/(b-c);
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("Execption happened");
		}
		finally {
			System.out.println("this is final");
		}

	}

}
