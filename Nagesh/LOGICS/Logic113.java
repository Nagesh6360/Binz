class Logic113
{
 static int a=4;
 static int b=a+10;
 static int c=a*b+1;
 static void add2(int b)
 {
  goo(6);
 }
 static void goo(int x)
 {
  int y=a+b+c;
  int z=y+x+10;
  System.out.println(z);
  foo(a);
 }
 static void foo(int m)
 {
  m=m*b*a+c;
  System.out.println(m);
 }
 public static void main (String []args)
 {
  add2(a+b+c);
  goo(a*b*c);
 }
}