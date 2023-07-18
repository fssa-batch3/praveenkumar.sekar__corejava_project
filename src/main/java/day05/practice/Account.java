package day05.practice;

public class Account{
	String accNo;
	double balance;
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		System.out.println(balance);
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
