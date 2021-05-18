package Bank_project;

public abstract class Account {

	int accountNum;
	double bal;
	
	public Account(int num)
	{
		accountNum=num;
		setBal(0.0);
	}
	
	public void setBalance(double balance)
	{
		bal = balance;
	}
	
	public abstract int getAccountNum()
	{
		return num;
	}
	
	public abstract double getBalance()
	{
		return bal;
	}
	
}
