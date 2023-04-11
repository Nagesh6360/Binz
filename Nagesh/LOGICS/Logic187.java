class Logic187
{
	static int evenMul(int n)
	{
	 int mul=1;
      for(int i=1; i<=n; i++)
	  if (i%2==0)
	 {
	  mul=mul*i;
   }
      return mul;
	}
 public static void main(String []args)
 {
  int no=10;
 int x= evenMul(no);
 System.out.println(x);
 }
}