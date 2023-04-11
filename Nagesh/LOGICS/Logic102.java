class Logic102
{
 static int pwd=1234;
 static void signup(int p1)
 {
  if(p1==pwd)
  {
   System.out.println("Signup is done");
   login(p1);
  }
 }
 static void login(int p2)
 {
  if (p2==pwd)
  {
   System.out.println("Login is done");
  }
 }
 public static void main (String []args)
 {
  signup(pwd);
 }
}