package oops;
class Outer

{
	class Inner
	{
		public void show()
		{
			System.out.println("display");
		}
	}
	
	static class Inner1
	{
		public void display()
		{
			System.out.println("show");
		}
	}
}
public class InnerClasses {
	public static void main(String[] args) {
	Outer obj=new Outer();
	Outer.Inner obj1=obj.new Inner();
	obj1.show();
	
	Outer.Inner1 obj2=new Outer.Inner1();
	obj2.display();
	}
}
