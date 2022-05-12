package JAVA_test;
/*A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively.
We have to print the money deposited by him in a particular bank.
Create a class 'Bank' with a function 'getBalance' which returns 0. 
Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a function with the same 
name 'getBalance' which returns the amount deposited in that particular bank. 
Call the function 'getBalance' by the object of each of the three banks.*/


abstract  class Bank {
		   abstract void getBalance();
		}

		class BankA extends Bank
		{
		   void getBalance()
		   {
		       System.out.println(" I have  deposited Money in A is $1000");
		   }
		}

		class BankB extends Bank
		{
		   void getBalance()
		   {
		       System.out.println(" I have  deposited Money in Bank B is $1500");
		   }
		}
		class BankC extends Bank
		{
		   void getBalance()
		   {
		       System.out.println(" I have deposited money in Bank C is $2000");
		   }	
	}


