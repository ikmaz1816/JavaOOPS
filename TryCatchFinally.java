package oops;
import java.util.*;
public class TryCatchFinally {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		try
		{
			int k=i/j;
			System.out.println(k);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			sc.close();
		}
		//finally block is always executed 
		//either the try or catch block is executed
	}

}
