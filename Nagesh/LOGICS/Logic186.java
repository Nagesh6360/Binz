class Logic186
{
	static int evenSum(int n)
	{
	 int sum=0;
      for(int i=1; i<=n; i++)
	  if (i%2==0)
	 {
	  sum=sum+i;
   }
      return sum;
	}
 public static void main(String []args)
 {
  int no=20;
 int x= evenSum(no);
 System.out.println(x);
 }
}