package oops;

public class ClassWithConstructor {
	// as soon as the object is created the constructor is intialized
	// that is the reason the constructor is mainly used to intialize values
	public ClassWithConstructor()
	{
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
		ClassWithConstructor a=new ClassWithConstructor();
		System.out.println(a.toString());
	}
	//so when the object is created the first thing that is initialized is the constructor.
	// Hence anything written in the constructor is executed.
}
