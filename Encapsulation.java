package oops;
class UserDetails
{
	private String name;
	private int serial;
	public UserDetails(String name,int serial)
	{
		setName(name);
		setSerial(serial);
	}
	private void setName(String s)
	{
		this.name=s;
	}
	private void setSerial(int a)
	{
		this.serial=a;
	}
	public String getName()
	{
		return this.name;
	}
	public int getSerial()
	{
		return this.serial;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		UserDetails a=new UserDetails("Imran",32);
		System.out.println(a.getName());
		System.out.println(a.getSerial());
		// Binding of the data is nothing but encapsulation
		// The most important thing is data and its security is very important 
		//That is the reason we use Encapsulation with OOPs
	}

}
