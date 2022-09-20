package oops;
import java.util.*;
public class TakingUserInputInArrayForEach {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] arr=new String[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
		}
		//This loop takes the input of an array
		for(String s:arr)
		{
			System.out.println(s);
		}
		//This is called as for-each loop
		//This loop is uesd with entities that have elements stored in them in a consecutive manner
		//It iterates over every index and print the value.
		sc.close();
	}

}
