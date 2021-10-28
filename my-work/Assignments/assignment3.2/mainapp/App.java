package in.assignment3.2.mainapp;

package in.assignment3.2.finance;.ATM;
package in.assignment3.2.finance;.Bank;

public class App {
	public static void main(String[] args) {
		Bank V=new Bank(9801,"pa@ss",7700);
		ATM A=new ATM();
		A.withdraw(9801,"p@ss",7700);
		A.Deposit(9801, 9000);
		A.changePassword("p@ss","varun@")	
		
	}
}