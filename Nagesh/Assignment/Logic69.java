class Logic69
{
 static int a=3;
 static void foo(int x)
 {
  System.out.println(x*x+2);
 }
 public static void main (String []args)
 {
  goo(a+2);
 }
 static void goo(int x)
 {
  x=x+8;
  foo(x);
 }
}