package oops;


public class ClassWithStaticFunctions {
	static int count=1;
	public void count()
	{
		count++;
	}
	public static void hello()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello();
		ClassWithStaticFunctions a=new ClassWithStaticFunctions();
		a.count();
		System.out.println(count);
	}
//as the function is already loaded into the method area hence it is visible
	// so no need to create an object as it is already loaded 
	//non static variable cannot be used inside static blocks
	//static variable can be used in non static blocks
}
