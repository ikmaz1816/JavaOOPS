package oops;

interface inter
{
	void abc();
}
class Milan implements inter
{
	public void abc()
	{
		System.out.println("Hello");
	}
}
//An interface is something same as abstract classes
//In interface a variable is final default
//In interface the methods are public abstract by default
//You can make a reference of interface but not object same as abstract class

public class Interface1 {

	public static void main(String[] args) {
		inter a=new Milan();
		a.abc();
	}

}
