package in.conceptarchitect.finance.storage;

import in.conceptarchitect.finance.BankAccount;
import in.conceptarchitect.finance.exceptions.InvalidAccountException;

public class AccountStorage {

		
		int lastId=0;
		int accountCount=0;
		
		
		BankAccount [] accounts= new BankAccount[100]; //MAX 100. May not be great for large banks

		
		public int addAccount(BankAccount account) {
			int accountNumber= ++ lastId;
			account.setAccountNumber(accountNumber);
			accounts[accountNumber] = account; //store this account in the array.
			accountCount++;
			return accountNumber;
		}
		
		 public BankAccount getAccountByNumber(int accountNumber) {
				// TODO Auto-generated method stub
				 
				if(accountNumber<0 || accountNumber>lastId || accounts[accountNumber]==null)
					 throw new InvalidAccountException(accountNumber);
				
				return accounts[accountNumber];
				
					
			}
		 
		 public void removeAccount(BankAccount account) {
			 accounts[account.getAccountNumber()]=null;
			 accountCount--;
		 }


		public int size() {
			// TODO Auto-generated method stub
			return accountCount;
		}
	
}
