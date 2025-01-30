import java.lang.*;

public class Account
{
  String AccountName;
  String AccountNumber;
  double Balance
  
  Account()
  {
  
  }
  Account(String ana, String ano, double ba)
  {
     AccountName=ana;
	 AccountNumber=ano;
	 Balance=ba
  }
  
  public void setAccountName(String ana)
  {
    AccountName=ana;
  }
  public void getAccountName()
  {
    return AccountName;
  }
  
    public void setAccountNumber(String ano)
  {
    AccountNumber=ano;
  }
  public void getAccountNumber()
  {
    return AccountNumber;
  }

  public void setBalance(double ba)
  {
    Balance=ba;
  }
  public void getBalance()
  {
    return Balance;
  }
  
  public void displayinfo()
  {
      System.out,println(AccountName)
	    System.out,println(AccounNumber)
		  System.out,println(Balance)
  }
}