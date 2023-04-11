class Logic68
{
 public static void main (String []args)
 {
  foo(5);
 }
 static void foo(int y)
 {
  sub(6);
 }
 static void sub(int b)
 {
  System.out.println(b+9);
  mull();
 }
 static void mull()
 {
  System.out.println(10+90);
 }
 static void add(int a,int b)
 {
  System.out.println(a*b+3);
 }
}