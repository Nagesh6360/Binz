class Logic93
{
 static int a=3;
 static int b=20;
 static void foo(int x)
 {
  System.out.println(x*b+2);
 }
 public static void main (String []args)
 {
  goo(a+2);
 }
 static void goo(int x)
 {
  x=x+8+(a*b);
  foo(x);
 }
}