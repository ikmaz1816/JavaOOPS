package oops;
import java.io.BufferedReader;
import java.io.*;
public class CheckedException {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		System.out.println(n);
	}
	//BufferedReader is one of the checked exception
	//As the input taken is in the file format
	//it can be integer string etc
	//Hence it is a checked exception

}
