package oops;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		//Two dimensional arrays can be also called as arrays of array
		// intialization
		int[][] a=new int[3][3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		//Second way of intializations
		a[2][0]=1;
		a[1][1]=6;
		// third way of intialization
		int[][] arr = {{1,2,3},{1,2,3},{1,2,3}};
		//for each loop for printing
		for(int[] i:arr)//Takes a single one at a time
		{
			for(int j:i)//Visit the single elements of an array 
			{
				System.out.println(j);
			}
		}
		sc.close();
	}

}
