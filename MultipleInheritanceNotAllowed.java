package oops;
class Mul1
{
	public void hello()
	{
		System.out.println("Hello World");
	}
}
class Mul2
{
	public Mul2()
	{
		hello();
	}
	public void hello()
	{
		System.out.println("Hello mul1");
	}
}
//class Mul3 extends Mul2,Mul1//Not allowed
//Mutliple inheritance is not allowed in the Java as the program will not know whose fuction to choose
class Mul3 extends Mul2
{
	public Mul3()
	{
		super();//Hello as the function is overriden
	}
    @Override
	public void hello()
	{
    	
		System.out.println("Hello");
	}
}
public class MultipleInheritanceNotAllowed {

	public static void main(String[] args) {
		Mul3 a=new Mul3();
		a.hello();

	}

}
