class Logic64
{
 static void foo(int x,int y)
 {
  boolean res=x<y;
  System.out.println(res);
 }
 static void boo(int x,int y)
 {
  boolean res=x>y;
  System.out.println(res);
 }
 public static void main (String []args){
 foo(25,76);
 boo(56,89);
 }
}