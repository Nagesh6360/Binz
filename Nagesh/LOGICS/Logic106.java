class Logic106
{
 static int pwd=1234;
 static int indiaScore=0;
 static int PakScore=0;
 static void signup(int p1)
 {
  if(p1==pwd)
  {
   System.out.println("Signup is successfully done");
   login(p1);
  }
 }
 static void login(int p2)
 {
  if (p2==pwd)
  {
  System.out.println("Login is successfully done");
  pakistan();
  }
 }
 static void pakistan()
  {
  int asa=70;
  int riz=60;
  int bar=85;
  int afrid=76;
  int vasim=55;
  int pakScore=asa+riz+bar+afrid+vasim;
  System.out.println("Pakistan score is "+pakScore);
  india();
 }
 static void india()
	{
  int sewag=60;
  int gambir=80;
  int sachin=70;
  int virat=50;
  int dhoni=91;
  int indiaScore=sewag+gambir+sachin+virat+dhoni;
  System.out.println("india score is "+indiaScore);
 }
 public static void main (String []args)
	{
  signup(pwd);
 }
}