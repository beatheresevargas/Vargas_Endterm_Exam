package Bank_project;

public class Checking extends Account {
	
	public Checking (int accountNum)
	{
		super(accountNum);
	}
	
	public int getAccountNum()
	{
		return accountNum;
	}
	
	public double getBalance()
	{
		return bal;
	}
	
	public String getInfo()
	{
		return("Checking Account Information \n Acct No: " + getAccountNum() + "Balance:" + getBalance());
	}

}
