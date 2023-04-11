class Logic123
{
 public static void main(String []args)
 {
  Logic123 m=new Logic123();
  m.boo(3,5);
  m.koo(8);
  m.foo(3,5);
  m.fee(8);
 }
 void boo(int h,int i)
 {
  System.out.println(i+h);
 }
 void koo(int x)
 {
  System.out.println(x+87);
 }
 void foo(int o,int i)
 {
  System.out.println(i+i);
 }
 void fee(int x)
 {
  System.out.println(x+67);
 }
}