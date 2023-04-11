class Logic107
{
 static int a=20;
 static void foo(int d,int b)
 {
  int res=a*2*b;
  System.out.println(res);
  get(b);
 }
 public static void main (String []args)
 {
  foo(5,2);
 }
 static void get(int a)
	{
  System.out.println(a+50);
  sample(10,40);
 }
 static void sample(int a,int b)
	{
 int demo=a+b;
 System.out.println(demo);
 }
}