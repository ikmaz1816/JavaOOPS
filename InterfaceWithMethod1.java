package oops;
interface method1
{
	void abc();
	default void disp()
	{
		System.out.println("Hello");
	}
}
class Method implements method1
{
	public void abc()
	{
		System.out.println("Hello there");
	}
	@Override
	public void disp()
	{
		System.out.println("hello in method1");
	}
}
//With programmers shifting to Scala Java then introduced methods in Interface
//This methods can also be overriden by subclass
public class InterfaceWithMethod1 {

	public static void main(String[] args) {
		method1 a=new Method();
		a.abc();
		a.disp();
	}
}
