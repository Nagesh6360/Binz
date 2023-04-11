class Flipkart
{
 static int pwd=1234;
 static int order_value=150;
 static void signup(int x)
 {
  if (pwd==x)
  {
   System.out.println("Signup is done");
   login(x);
  }
 }
 static void login(int y)
 {
  if (pwd==1234 && y==pwd)
  {
   System.out.println("Login is done");
   purchase(y);
  }
 }
 static void purchase(int z)
 {
  if (pwd==z)
  {
   System.out.println("The order value is "+order_value);
   System.out.println("order successfully done");
   logout(z);
  }
 }
 static void logout(int n)
 {
  if (pwd!=n || pwd==n)
  {
   System.out.println("Logout is done");
  }
 }
 public static void main (String []args)
 {
  signup(1234);
 }
}