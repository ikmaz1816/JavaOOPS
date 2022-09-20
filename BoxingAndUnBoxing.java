package oops;

public class BoxingAndUnBoxing {

	public static void main(String[] args) {
		int i=5;
		 Integer j= i;//Boxing
		 
		 int a=j.intValue(); //Unboxing
		 
		 a=j;//Autounboxing
		  
		 //So when we are wrapping with the help of function it is called as boxing and unboxing
		 //But when we are wrapping without the help of function it is called autoboxing or autounboxing
		 System.out.println(a);
		 // When we deal with generics we mostly uses classes and not primitive data type
	}

}
