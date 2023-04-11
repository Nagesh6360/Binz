class Logic55
{
 static void mul()
 {
  int a=10;
  System.out.println(a);
  }
  static void div()
  {
   int b=30;
   System.out.println(b);
  }
  static void sub()
  {
   int a=40;
   mul();
   div();
   System.out.println(a);
  }
  public static void main (String []args)
  {
   sub();
  }
}