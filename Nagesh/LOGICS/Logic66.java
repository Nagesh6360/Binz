class Logic66
{
 static void g(int x,int y)
 {
  System.out.println(x*y);
 }
 static void i(int y)
 {
  int x=30;
  System.out.println(50+y);
  g(x,y);
 }
 public static void main (String []args)
 {
  g(3,2);
 }
}