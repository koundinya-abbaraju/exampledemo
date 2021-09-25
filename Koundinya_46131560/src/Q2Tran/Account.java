package Q2Tran;
public class Account
{
	private int AccountNumber;
	private String accountHolderName;
	Localdate openedDate;
	double balance;
	public Account(int accountNumber, String accountHolderName, Localdate openedDate, double balance) 
	{
		AccountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.openedDate = openedDate;
		this.balance = balance;
	}
	public String getAccountHolderName() 
	{
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) 
	{
		this.accountHolderName = accountHolderName;
	}
	public Localdate getOpenedDate() 
	{
		return openedDate;
	}
	public void setOpenedDate(Localdate openedDate)
	{
		this.openedDate = openedDate;
	}
	public int getAccountNumber() 
	{
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) 
	{
		AccountNumber = accountNumber;
	}
	public double validateBalance(double balance)
	{
		if(balance< 5000) 
			return 0;
		else 
			return balance;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = validateBalance(balance);
	}
}
