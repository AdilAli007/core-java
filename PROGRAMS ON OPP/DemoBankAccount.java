class DemoBankAccount {
	public static void main(String args[]) {
	BankAccount obj = new BankAccount();
	SavingsAccount obj1 = new SavingsAccount();
	obj.deposit();
	obj.withdraw();
	obj1.withdraw();
 }
}

class BankAccount {
	public void deposit()
	{
	int amount = 5000;
	int addDeposit = 100;
	int totalAmount = amount + addDeposit;
	System.out.println("Total Amount: "+totalAmount);
	}
	
	public void withdraw()
	{
	int totalAmount = 5100;
	int amountWithdraw = 1000;
	int amountAfterWithdraw = totalAmount - amountWithdraw;
	System.out.println("Amount after withdraw: "+amountAfterWithdraw);
	}
}

class SavingsAccount extends BankAccount {
	public void withdraw()
	{
	int remainingAmount = 99 ;
	if (remainingAmount < 100)
	{
	System.out.println("Your Balance is less than 100 can't withdraw ");
	}
	else {
	System.out.println("Remaining Amount: "+remainingAmount);
	}
	}
}
	
