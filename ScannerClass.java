package oops;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//This is scanner class for taking inputs
		int a=sc.nextInt();//this is for integer
		String b=sc.next();//this is for String
		char c=sc.next().charAt(0);
		float d=sc.nextFloat();
		double e=sc.nextDouble();
		System.out.println(a+" "+b+" "+c+" "+d+" "+e);
		sc.close();
	}

}
