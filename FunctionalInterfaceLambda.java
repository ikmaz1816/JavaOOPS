package oops;
interface O
{
	void abc();
}
public class FunctionalInterfaceLambda {

	public static void main(String[] args) {
		O a=()->System.out.println("Hello");
		a.abc();
		//This is lambda function in Java
		//It can be used with functional interface as well
	}

}
