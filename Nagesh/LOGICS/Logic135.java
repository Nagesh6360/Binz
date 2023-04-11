class Logic135
{
 void disp1()
	{
 System.out.println("Hi");
 }
  void disp2()
	{
 disp1();
 }
 public static void main (String []args)
 {
  new Logic135().disp2();
 }
}