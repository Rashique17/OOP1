import java.lang.*;

public class MyInfo 
{
   public static void main(String args[])
   {
	   String s1 = "Kamrul Islam Pavel";
       double d1=73;
       System.out.println("My name is: "+ s1);
       System.out.println("My mark is: "+ d1);
	   
	   if (d1>=90)
	   {
	   System.out.println("My grade is A+");
	   }
	   else if (d1>84 && d1<90)
	   {
		  System.out.println("My grade is  A");
	   }
	   else if (d1>79 && d1<85)
	   {
		   System.out.println("My grade is B+");
		   
	   }
	   else if (d1>74 && d1<80)
	   {
		   System.out.println("My grade is B");
	   }
	   else if (d1>69 && d1<75)
	   {
		   System.out.println("My grade is C+");
	   }
	   else if (d1>64 && d1<70)
	   {
		   System.out.println("My grade is C");
	   }
	   else if (d1>59 && d1<65)
	   {
		   System.out.println("My grade is D+");
	   }
	   else if (d1>54 && d1<60)
	   {
		   System.out.println("My grade is D");
	   }
	   else 
	   {
		   System.out.println("my grade is F");
	   }
   }
     
}