import java.lang.*;

class Posneg
{
	private int a;
	
	public Posneg()
	{
		
	}
	
	public Posneg(int a)
	{
		this.a=a;
	}
	
	public void display()
	{
		if (a>0)
		{
			System.out.println("This Number You Stored Is Positive");	
		}
		else if (a<0)
		{
		    System.out.println("This Number You Stored Is Negative");	
		}
		else
		{
			System.out.println("This Number You Stored Is Zero");
		}
	}
	
	public static void main(String args[])
	{
		Posneg n=new Posneg(6);
		n.display();
	}
}