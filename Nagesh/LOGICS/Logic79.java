class Logic79
{
  public static void main (String []args)
 {
  float radius=7.0f;
  int t=10;
  if (radius>0.0f || t>=10 && radius !=t)
  {
	  double area=1/2.0*radius*radius*t;
	  System.out.println(area);
  }
 }
}