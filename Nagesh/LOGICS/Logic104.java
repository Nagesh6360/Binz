class Logic104
{
 static int total_marks=300;
 static void finalResult(int j,int m,int s)
 {
  {
   if (j>=35 || m>=35 || s>=35)
   {
   int obtained_Marks=j+m+s;
   double per=(obtained_Marks*100)/total_marks;
   System.out.println(per);
   }
  }
 public static void main (String [] args)
 {
  int java=36;
  int maths=36;
  int science=36;
  if (java>=35 || maths>=35 || science>=35)
  {
   finalResult(java,maths,science);
  }
 }
}