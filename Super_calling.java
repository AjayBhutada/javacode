package Inheritance_level;
class Google 
{
	Google(int a,boolean b)
	{	
		//super(123,'c');
		System.out.println("Login to FB");
	}
}
class Flipkart extends Google
{
	Flipkart()
	{
		super(123,false);
		System.out.println("Login to Insta");
		
	}
}
public class Super_calling extends Flipkart
{
	Super_calling(int a, char c)
	{
		System.out.println("Ajay");
	}
	public static void main(String[] args) 
	{
		new Super_calling(123,'k');
	}
}
