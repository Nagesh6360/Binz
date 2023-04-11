class Logic95
{
  public static void main (String []args)
 {
  int base=7;
  int height=8;
  if (base>0 && base<10 || height>0 && height<10)
  {
	  double area=0.5*base*height;
	  double c=area;
	  double L=c;
	  System.out.println(area);
	  System.out.println(c);
	  System.out.println(L);
  }
 }
}