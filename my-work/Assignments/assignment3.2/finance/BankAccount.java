package in.assignment3.2.finance;

public class BankAccount {
	
	int accountNumber;
	String password;
	double balance;
	double interestRate;

	
	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = salt(password);
	}

	

private String salt(String password) {
		
		String salted="";
		
		for(int i=0;i<password.length();i++) {
			int ch= (int) password.charAt(i);
			salted+=Integer.toHexString(ch);
		}
		
		return salted;
	}

	public void show() {
		System.out.println("account no.\t"+accountNumber);
		System.out.println("password  \t"+password);
		System.out.println("balance      \t"+balance);
		
		
	}

	public boolean deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			return false;
		} else {
			return true;
		}
	}

	public boolean withdraw(double amount, String password) {
		if(amount <=0) {
			return false;
		}
		if (amount>balance) {
			return false;
		} 
		if (!this.password.equals(password))
			return false;
		else {
			
			balance-=amount;
			return true;
		}
	}
	
	public void creditInterest(double balance,double interestRate) {
		balance+=(balance*interestRate/1200);
	}
}