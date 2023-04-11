class Logic94
{
	static int a=25;
	static int b=30;
	static int c=a+b*a;
 static void goo(int x,int y)
 {
  System.out.println(x*y+25);
 }
 static void i(int y)
 {
  int x=30+c;
  System.out.println(50+y);
  goo(x,y);
 }
 public static void main (String []args)
 {
  goo(3,2);
 }
}