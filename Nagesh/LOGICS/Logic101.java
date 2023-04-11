class Logic101
{
 static int pwd=1234;
 static void login(int pass)
 {
  if(pass==pwd)
  {
   System.out.println("Login is successfully done");
  }
 }
 public static void main (String []args)
 {
  login(pwd);
 }
}