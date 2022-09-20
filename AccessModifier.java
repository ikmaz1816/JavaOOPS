package oops;
class SOP
{
	private int a;
	public int b;
	protected int c;
	int i;//default
	public SOP()
	{
		System.out.println(a+" "+b+" "+c+" "+i);
	}
	//Public access specifier can be used in any class or package
	//private in the class declared only
	//default in the package itself
	//protected in the subsiding class it can be in the same package or different package
}
public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
