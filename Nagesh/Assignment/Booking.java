class Booking
{
 static int Swiggy (String food)
 {
  int order=hotel();
  return order;
 }
  static int hotel()
  {
   return 250;
  }
  public static void main (String []args)
  {
   int x=Swiggy ("Chapati");
   System.out.println(x);
  }
}