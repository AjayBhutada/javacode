package Inheritance_level;

class ajay
{
	void login ()
	{
		System.out.println("Name");
	}
}
public class Method_Over_Ridding extends ajay
{
	void login ()
	{
		super.login();
		System.out.println("Ajay");
		
	}
public static void main(String[] args) 
{
	
	Method_Over_Ridding n1=new Method_Over_Ridding ();
	n1.login();
}
	
}
