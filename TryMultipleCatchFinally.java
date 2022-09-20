package oops;

public class TryMultipleCatchFinally {

	public static void main(String[] args) {
		int i=9;
		int j=0;
		int[] arr=new int[0];
		try
		{
			arr[4]=0;
			int k=i/j;
			
			System.out.println(k);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
		System.out.println("DONE");	
		}
		/*
		  Catch Exception e will catch all the exception
		  Arithematic Exception will catch only arithmetic exception
		  ArrayIndexOutOfBoundsException will catch Array index exception
		  If we write catch(Exception e) then there is no need of any catch block
		  finally block is executed every time
		  Once a exception is found it directly moves to the finally block and omits all other blocks
		 */
	}

}
