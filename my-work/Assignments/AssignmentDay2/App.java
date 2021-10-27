package in.conceptarchitect.financeapp;

import java.util.Scanner;

import in.conceptarchitect.finance.Atm;
import in.conceptarchitect.finance.BankAccount;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Atm sbi = new Atm();
		sbi.a1.show();
		sbi.a1.deposit(200000);
		sbi.a1.creditInterest();
		sbi.a1.withdraw(500,"jfhf");
		sbi.a1.changePassword("jfhf","new@jfhf");
       sbi.a1.show();		
		

		
		
		
		
	}

}