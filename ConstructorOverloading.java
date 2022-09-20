package oops;

public class ConstructorOverloading {
	int a, b;
	public ConstructorOverloading()
	{
		System.out.println("No parameters inside");
		System.out.println(this.a+" "+this.b);
	}
	public ConstructorOverloading(int a)
	{
		this.a=a;
		System.out.println(this.a+" "+this.b);
	}
	public ConstructorOverloading(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(this.a+" "+this.b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ConstructorOverloading a=new ConstructorOverloading();
//		ConstructorOverloading b=new ConstructorOverloading(3);
//		ConstructorOverloading c=new ConstructorOverloading(3,4);
		// All are execcuting fine!!
		
	}

}
