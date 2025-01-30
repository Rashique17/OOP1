import java.lang.*;

class Evenodd
{
	private int a;
	
	public Evenodd()
	{
		
	}
	
	public Evenodd(int a)
	{
		this.a=a;
	}
	
	public void display()
	{
	 if (a%2==0)
		{
			System.out.println("This Number You Stored Is Even");	
		}
		else
		{
			System.out.println("This Number You Stored Is Odd");	
		}
		
	}
	
	public static void main(String args[])
	{
		Evenodd n=new Evenodd(6);
		n.display();
	}
}