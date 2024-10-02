package Inheritance_level;
class parents 
{
	void login()
	{
		System.out.println("login with email Id ");
	}
	void login_ID()
	{
		System.out.println("login with otp Id ");
	}
	static void login_Password()
	{
		System.out.println("login with password Id ");
	}
}
public class Method_Overridding extends parents
{
	static void Ajay()
	{
		System.out.println("Ajay login to Flipkart");
	}
 void login ()
{
	System.out.println("Login with the mobile number");
	super.login();
}
public static void main(String[] args) 
{
	System.out.println("Flipkart login");
	Method_Overridding n1= new Method_Overridding();
	n1.login ();
	Ajay();
	n1.login_ID();
	login_Password();
	
	
}
}
