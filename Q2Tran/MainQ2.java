package Q2Tran;
public class MainQ2 
{
	public static void main(String[] args)
	{
		Account a1= new Account(44471,"Koundinya",new Localdate(25,9,2021), 10000);
		System.out.println("Account Number:-" +        a1.getAccountNumber());
		System.out.println("Account holder name:-" +   a1.getAccountHolderName());
		System.out.println("Account opened date:-" +   a1.getOpenedDate());
		System.out.println("Account balance:-" +       a1.getBalance());
		try
		{
			Transaction.withdraw(a1,6000);
		}
		catch(InsufficientBalanceException ex)
		{
			System.out.println(ex);
		}
		System.out.println("After the transaction your balance is  " + a1.getBalance());
		
	}
}
