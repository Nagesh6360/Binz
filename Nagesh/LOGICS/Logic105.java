class Logic105
{
 static int total_mark=300;
 static int pass_mark=105;
 static void finalResult(int j,int m,int s)
 {
   int obtained_Marks=j+m+s;
   double per=((obtained_Marks*100)/total_mark);
   System.out.println(per);
  }
 public static void main (String []args)
 {
  int ja=87;
  int ma=67;
  int sc=95;
  finalResult(ja,ma,sc);
 }
}