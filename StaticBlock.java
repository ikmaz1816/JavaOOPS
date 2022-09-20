package oops;
class Stat
{
	static int i;
	static
	{
		i=1;
	}
	public Stat()
	{
		System.out.println("hi");
	}
}
public class StaticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Stat a=new Stat();
			Stat b=new Stat();
			System.out.println(a+" "+b);
			//EVery time the object is created the constructor is called and static block is intialized once
	}

}
