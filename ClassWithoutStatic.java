package oops;

public class ClassWithoutStatic {

		public void helloWorld()
		{
			System.out.println("Hello World");
		}
		//non static words are placed in the heap area
		//Hence it is not visible in the static  part
		//So we have to create the object of the class 
		//Which loads all the functionalities of the class in the method area
		//Which goes into the stack when JVM is started
		public int belowReturn()
		{
			return Integer.MAX_VALUE;
		}
		public static void main(String[] args) {
			ClassWithoutStatic a=new ClassWithoutStatic();
			a.helloWorld();
			System.out.println(a.belowReturn());
		}


	}
