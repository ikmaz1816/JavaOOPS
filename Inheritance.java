package oops;
class Inhi
{
	int a,b;
	public Inhi(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public int add()
	{
		return this.a + this.b;
	}
	public int sub()
	{
		return this.a - this.b;
	}
}
// when the class is extended the functionalities of the other class is copied or can be used by the class
// that has extended it.

class Calculator extends Inhi
{
	int a,b;
	public Calculator(int a,int b)
	{
		super(a,b);
		this.a=a;
		this.b=b;
	}
	public int mul()
	{
		return this.a * this.b;
	}
	public int div()
	{
		return this.a/this.b;
	}
	
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator a=new Calculator(5,4);
		System.out.println(a.add());
		System.out.println(a.sub());
		System.out.println(a.mul());
		System.out.println(a.div());
	}
// there can be only one public class in the Program
}
