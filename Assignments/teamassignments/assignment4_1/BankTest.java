package in.teamassignments.assignments4_1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import in.teamassignments.assignments4_1.Bank;


//deposit test cases by Naveen ->
public class BankTest{

        String password="password";
		double amount=20000;
		double wiitdrawamt=10000;
        Bank accounts;
		double insterestRate;

        public static void main(String[]){

                @Before
                public void init()
                    account = new BankAccount(1,"Varun",password,amount);
                    System.out.println("@beforeCalled");
                @test
                public void depostfailedforexcess()
                {

                    boolean result=account.deposit(amount+1,password);
                    assertEquals(false,result);

                }
                @test 
                public void invalidaccountornot(int account,String Password,double amount) {
                        if(!account==accountNumber) {
                            
                            return false;
                        }
                                
                        
                    }

                }
                @test
                public void validamountandaccount(int account,String Password,double amount) 
                {
                if(account==accountNumber) {
                        boolean result=account.deposit(amount,password);
                        assertEquals(true,result);
                            return true;
                        }		
                    

                }	

        //Withdraw test cases by Varun ->
                @Test
                public void withdrawFailInvalidAmount()
                {
                    boolean result=account.withdraw(0000,password);
                    assertEquals(false,result);
                }

                @Test
                public void withdrawFailInvalidPassword()
                {
                    boolean result=account.withdraw(amount," ");
                    assertEquals(false,result);
                }

                @Test
                public void withdrawFailNegativeAmount() {
                    boolean result=account.withdraw(-1, password);		
                    assertEquals(false, result);
                }	

                @Test 
                public void withdrawFailExcessAmount() {
                    boolean result=account.withdraw(amount+1, password);
                    assertEquals(false,result);
                }
        //Transfer test cases by Neha ->

                    public void transferPasswordfail()
                    {
                        int fromAccount=9801;
                        int toAccount=98011;
                        String password="pass";
                        double amount=5000;
                        boolean result=account.transfer(fromAccount,amount,password,toAccount);
                        assertEquals(false,result);
                    }

                    @Test
                    public void transferAccountnumberfail()
                    {
                        String password="password";
                        int fromAccount=-9801;
                        int toAccount=9801;
                        double amount=5000;
                        boolean result=account.transfer(fromAccount,amount,password,toAccount);
                        assertEquals(false,result);
                    }
                    
                    @Test
                    public void transferAmountfail()
                    {
                        
                        String password="password";
                        int fromAccount=9801;
                        int toAccount=98011;
                        double amount=00;
                        boolean result=account.transfer(fromAccount,amount,password,toAccount);
                        assertEquals(false,result);
                    }



            }
}