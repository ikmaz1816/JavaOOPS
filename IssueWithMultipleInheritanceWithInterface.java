package oops;
interface copy
{
	 default void disp()
	 {
		 System.out.println("hi");
	 }
	
}
interface copy1
{
	 default void disp()
	 {
		 System.out.println("hi");
	 }
}
class U implements copy ,copy1
{
	//To avoid ambiguity you have to override both of the function in the class you implement it
	@Override
	public void disp()
	{
		System.out.println("Hello World");
	}
}
public class IssueWithMultipleInheritanceWithInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		U a=new U();
		a.disp();
	}

}
