package oops;
import java.io.*;
public class TryWithResource {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
		{
			int n=Integer.parseInt(br.readLine());
			System.out.println(n);
		}
		//Now this try will also make sure that after coming out of the block it closes the bufferedReader.
	}
	//You can also have a try and finally with throws Exception if it is a checked one

}
