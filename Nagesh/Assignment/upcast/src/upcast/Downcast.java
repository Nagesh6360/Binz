package upcast;
class Sample2
{
 void test()
 {
	 System.out.println("its test.......");
 }
}
class Demo2 extends Sample2
{
 void goo()
 {
	 System.out.println("its gooo....");
 }
}
public class Downcast {

	public static void main(String[] args) 
	{
	 Sample2 s= new Demo2();
	 s.test();
	 Demo2 d=(Demo2)s;
	 d.goo();
	 d.test();
	}

}
