package oops;

public class Varags {
	public static void sum(int ...i)
	{
		int sum=0;
		for(int k:i)
		{
			sum+=k;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			sum(2,3,4,5);
	}

}
