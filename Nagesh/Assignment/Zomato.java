class Hotel
{
 void food()
 {
  System.out.println("Biriyani ordered successfully");
 }
}

class Zomato
{
 public static void main (String []args)
 {
  Hotel H= new Hotel();
  Customer1.order(H);
  Customer2.order(H);
 }
}

class Customer1
{
 static void order(Hotel x)
 {
  x.food();
 }
}

class Customer2
{
 static void order(Hotel y)
 {
  y.food();
 }
}