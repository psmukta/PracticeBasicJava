package basic;

public class TestBank {

	public static void main(String[] args) {
		
		 int actNo=1234;
		 int ssn=6543;
		 String clientName="Salam";
		 String actType="Saving";
		 long balance=3000;
		
		 Bank bank=new Chase(1234,6543,"Salam","Saving",3000);
		 
		 bank.setBalance(5000);
		 System.out.println("Chase info: "+bank);
		 bank=new BOA(1234,6543,"Kalam","Saving",3000);
		 System.out.println("BOA info: "+bank);
		
		 
		 
		 
	}

}
