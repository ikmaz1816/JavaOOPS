package oops;
final class C
{
	
}
//class D extends C
//{   Error
//	
//}

class E
{
	public final void show()
	{
		System.out.println("HI");
	}
}
class D extends E
{
//	@Override
//	public void show()
//	{
//		System.out.println("Hello");  Error
//	}
}
public class Final {
	static final int a=5;
	public static void main(String[] args) {
		// Final methods cannot be overriden
		//final class cannot be extended
		//final variable value cannot be changed
//		a=3; error
	}

}
