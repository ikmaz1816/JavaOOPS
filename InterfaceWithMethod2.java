package oops;
interface Meth
{
	void abc();
	static void sum(int a,int b)
	{
		System.out.println(a+b);
	}
}
class Meth1 implements Meth
{
	public void abc()
	{
		System.out.println("Hello");
	}
	//There is no need to override static method of interface as it is already defined for certain purpose in interface
//	@Override
//	public void sum(int a,int b)
//	{
//		System.out.println(a+b);
//	}
}
public class InterfaceWithMethod2 {

	public static void main(String[] args) {
		Meth a=new Meth1();
		a.abc();
       }
   }
