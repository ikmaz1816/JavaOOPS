package oops;

class Method2
{
	public void hello1()
	{
		System.out.println("Hello World");
	}
}
class Met extends Method2
{
	@Override
	public void hello1()// if i just write hello as hello1 it will now give error
	//It actually tells us that the method is overriden and it's name cannot be changed
	{
		System.out.println("Hello Imran");
	}
}
public class Methodoverriding{

	public static void main(String[] args) {
		Method2 a =new Met();
		a.hello1();
		// it would print the method from class method1
		//you have to give it annotations
	}

}
