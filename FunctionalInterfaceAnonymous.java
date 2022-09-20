package oops;
//There are three types of Interface
//Normal interface with more than one abstract method
//Functional interface having only one abstract method
//Marker interface having no methods 
interface Functional
{
	void abc();
	default void disp()
	{
		System.out.println("Hello World");
	}
}
//This interface is functional even though it has two method but it has only one public abstract method
public class FunctionalInterfaceAnonymous {

	public static void main(String[] args) {
		Functional a=new Functional()
				{
					public void abc()
					{
						System.out.println("Hello");
					}
				};
				a.abc();
				a.disp();
				//So instantiate it using Anonymous clas

	}

}
