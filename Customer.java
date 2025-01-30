import java.lang.*;

class Customer
{
	private String name;
	private String gender;
	Account accounts[];
	
	public Customer()
	{
		
	}
	
	public Customer(String name, String gender, int size)
	{
		this.name=name;
		this.gender=gender;
		accounts=new Account[size];
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	
	public void insertAccount(Account acc)
	{
		int flag=0;
		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i]==null)
			{
				accounts[i]=acc;
				flag=1;
				break;
			}	
		}
		if(flag==0)
				{
					System.out.println("Account could not be inserted");
				}
		else
				{
					System.out.println("Account inserted");
				}
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public void displayAccount()
	{
		System.out.println("Customer Name  : "+name);
		System.out.println("Gender         : "+gender);
		for(int i=0;i<accounts.length;i++)
		{
			if (accounts[i]!=null)
			{
		System.out.println("Account Name   : "+accounts[i].getAccountName());
		System.out.println("Account No     : "+accounts[i].getAccountNo());
		System.out.println("Account Balance: "+accounts[i].getBalance());
			}
		}
	}
}