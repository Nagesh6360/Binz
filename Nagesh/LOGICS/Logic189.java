class Logic189
{
	static int factorial(int z)
	{
	 int fact=1;
      for(int i=z; i>=1; i--)
	 {
	  fact=fact*i;
      }
	  return fact;
	}
 public static void main(String []args)
 {
	 int no =5;
	 int x=factorial(no);
      System.out.println(x);
 }
}
