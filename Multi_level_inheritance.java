package Inheritance_level;
class a 
{
	static void first()
	{
		System.out.println("This is the 1st");
	}
	class b extends a
	{
		static void second()
		{
			System.out.println("This is the 2nd ");
		}
		
	}
}
public class Multi_level_inheritance extends a
{
	static void fourth ()
	{
		System.out.println("this is 4th");
	}
public static void main(String[] args) 
{
	
}
{
	System.out.println("Order");
	fourth ();
	first();
	//second();
	
	
	}
}
