package basic;

public abstract class Bank {
	 int actNo;
	 int ssn;
	 String clientName;
	 String actType;
	 long balance;
	 
	public int getActNo() {
		return actNo;
	}
	public void setActNo(int actNo) {
		this.actNo = actNo;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getActType() {
		return actType;
	}
	public void setActType(String actType) {
		this.actType = actType;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Bank [actNo=" + actNo + ", ssn=" + ssn + ", clientName=" + clientName + ", actType=" + actType
				+ ", balance=" + balance + "]";
	}
	
	
	

}
