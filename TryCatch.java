package oops;

public class TryCatch {

	public static void main(String[] args) {
		int i=9;
		int j=0;
		try
		{
			int k=i/j;
			System.out.println(k);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
