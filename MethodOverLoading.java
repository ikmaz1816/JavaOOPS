package oops;

public class MethodOverLoading {
	public int sum(int a,int b)
	{
		return a+b;
	}
	public int sum(int a,int b,int c)
	{
		return a+b+c;
	}
	public float sum(float a,int b)
	{
		return a+b;
	}
	// use of the same function name but with different arguments that may or mat npt perfrom the same functions

	public static void main(String[] args) {
		MethodOverLoading a=new MethodOverLoading();
		System.out.println(a.sum(4,5));
		System.out.println(a.sum(9.5f, 8));
		System.out.println(a.sum(8, 7,6));
	}

}
