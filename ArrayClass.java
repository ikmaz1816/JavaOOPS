package oops;

public class ArrayClass {

	public static void main(String[] args) {
		//Arrays are elements that are stored in consecutive manner
		//Declaration of an array can be of many types
		//You should also specify the type of array
		int[] arr=new int[5];
		//The indexing in an array start from 0 and goes till size-1;
		//To know the length of Array you can use the .length function
		int n=arr.length;
		//Array can also be declared as 
		int[] arr1= {1,2,3,4,5};
		int[] arr2=arr1;
		//arrays are refernces hence they point to certain location
		//Now arr1 and arr2 are pointing to the same reference
		int[] arr3=new int[] {1,2,3,4,5};
		System.out.println(arr1);//This will give you the reference id;
		System.out.println(arr2);
		System.out.println(arr3);
		//The reference ids of both arr1 and arr2 are the same 
		//The reference id of arr1 and arr3 are different as they are not pointing to the same location
		//Even though they have the same value.
		//This means values can be same but refernces can be different in case of Arrays
		//For printing an array
		for(int i=0;i<n;i++)
		{
			System.out.println(arr1[i]);
		}
		//Another way of initializing an array is 
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		arr[3]=3;
		arr[4]=4;
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
