class Zomato
{
  int food(int biriyani)
 {
  return biriyani-100;
 }
 static void food(String kuska)
 {
  System.out.println("Given extra kuska for Rs.80 is "+kuska);
 }
 static void food(char grade,double Amunt)
 {
  System.out.println("Biriyani grade is "+grade+" and biriyani price is "+Amunt);
 }
 static int food(int biriyani,long price)
 {
  return biriyani;
 }
 public static void main(String []args)
 {
  int x=new Zomato().food(255);
  System.out.println("Biriyani first price is "+x);
  food("Best kuska");
  new Zomato().food('A',355.50);
  int y=food(355,255);
  System.out.println("Biriyani last price is "+y);
 }
}