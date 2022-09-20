package oops;
abstract class Yes
{
	abstract public void show();
	public static void display()
	{
		System.out.println("display");
	}
	public void disp()
	{
		System.out.println("disp");
	}
}
//In Abstract classes we can have concrete methods.
//Concrete methods are also called as Static methods.
//It supports static and non static methods
//we can make the reference of Abstract classes but not the object
class No extends Yes
{
	public void show()
	{
		System.out.println("hello");
	}
}
public class AbsractClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yes a =new No();
		a.show();
		Yes.display();
		a.disp();
		//Static methods can be accessed via the class itself
	}

}
//if we have anyone method as abstract the class becomes an abstract class
//abstract meaning it implementation can be done later on
//The class which extends it implements the method
//The class which extends the abstract class it is compulsory for the child class to implement method of 
//Abstract class
