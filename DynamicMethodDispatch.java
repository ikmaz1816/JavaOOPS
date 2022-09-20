package oops;
class one
{
	public void display()
	{
		System.out.println("Hello");
	}
}
class two extends one
{
	public void show()
	{
		System.out.println("Hello in show");
	}
	public void display()
	{
		System.out.println("Hello in two");
	}
}
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one a=new two();
		//Reference is of and object is of B
		//Hence functionalities present in B are called 
		//This is called as dynamic method dispatch
		//Now we can access only those functions which are commom to both of them
		//Here we can access display but not show as show is not present in the parent class
		//For dynamic method dispatch it is necessary that you have implemented or extended class or Interface
		//As the object 
		a.display();
//		a.show() gives error
		//Object is of B hence display of B is called 
	}

}
