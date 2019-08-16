package oppsClass;

public class TestClass {

	public static void main(String[] args) {
		CarClass BMW=new CarClass(4,3,5,200);
		BMW.slowSpeed(50);
		System.out.println("Seat number :"+BMW.getSeat());
		System.out.println(BMW);
	}

}
