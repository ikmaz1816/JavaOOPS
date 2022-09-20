package oops;

public class JaggedArrays {

	public static void main(String[] args) {
		//Jagged Arrays are arrays whose columns are not specified at the time of initialization
		int[][] arr=new int[4][];
		//we intialize the column number according to our own will
		for(int i=0;i<4;i++)
		{
			arr[i]=new int[i+1];
		}
		//It will now intialize
		//for the zero row 1 column
		//for the first wor 2 column and likewise
		for(int[] i:arr)
		{
			for(int j:i)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
