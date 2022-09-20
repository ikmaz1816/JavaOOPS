package oops;
class A
{
	public void show()
	{
		System.out.println("Hello World");
	}
	public void sum(int a,int b)
	{
		System.out.println(a+b);
		}
}
class B extends A
{
	@Override
	public void show()
	{
		super.show();//Will call for the show method of parent class
		System.out.println("Hello World");
	}
	public B(int a,int b)
	{
		super.sum(a, b);
	}
}
public class Super {

	public static void main(String[] args) {
		B a=new B(4,5);//This will call for the ovveriden method
		a.show();
	}

}
