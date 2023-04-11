class Logic53
{
  public static void main (String []args)
  {
   System.out.println("*******Main start*********");
   add();
   System.out.println("*******Main ends*********");
  } 
 static void add()
 {
  int a=5;
  int b=10;
  System.out.println(a*b);
  b=a*b+5;
  System.out.println(a*b);
 }
}