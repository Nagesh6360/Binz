class Logic120
{
 static int purchase(int amt)
  {
  return amt-30000;
 }
 static int fees(int amt)
	{
   return amt-15000;
 }
 public static void main (String []args)
	{
  int Loan_amt=50000;
  int X=purchase(Loan_amt);
  int res =fees(X);
  System.out.println(res);
 }
}