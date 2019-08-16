package basic;

public class BOA extends Bank {
	
public BOA() {
		
	}
	public BOA(int actNo,int ssn,String clientName,String actType,long balance) {
		this.actNo=actNo;
		this.ssn=ssn;
		this.clientName=clientName;
		this.balance=balance;
		this.actType=actType;
	}

}
