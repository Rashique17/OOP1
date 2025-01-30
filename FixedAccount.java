import java.lang.*;

public class FixedAccount extends Account
{
  double InterestRate;
  int Year;
 
 FixedAccount()
 {
 
 }
 FixedAccount(double ir , int yr)
 {
   ir=InterestRate;
   yr=Year;
 }
 FixedAccount(double InterestRate)
 {
   ir=InterestRate;
 }
 FixedAccount(int Year)
 {
   yr=Year; 
 }
 
 public void setInterestRate(double InterestRate)
  {
     ir=InterestRate;
  }
 public void setYear(int Year)
  {
     yr=Year;
  }
 public double getInterestRate()
 {
   return InterestRate;
 }
public int getYear()
 {
   return Year;
 }
 

}