class Logic115
{
 static void print(int x)
 {
  System.out.println(x+10);
 }
 static void calculate(int a)
 {
  int x=90;
  System.out.println(a+20+x);
  print(x);
 }
 public static void main (String []args)
 {
  start(10);
 }
 static void start(int x)
 {
  calculate(x);
 }
}