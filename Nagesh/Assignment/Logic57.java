class Logic57
{
  public static void main (String []args)
  {
   area4();
  }
 static void area1()
 {
  int a=2;
  int res=a*a;
  System.out.println(res);
  }
  static void area2()
  {
   final double pi=3.142;
   int a=2;
   int b=3;
   double res=pi*a*a;
   System.out.println(res);
  }
  static void area3()
  {
   int a=5;
   area2();
   area1();
  }
  static void area4()
  {
   int a=10;
   area3();
  }
}