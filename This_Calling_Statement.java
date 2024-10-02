package Inheritance_level;

public class This_Calling_Statement 
{
This_Calling_Statement ()
{this(1);
	System.out.println("Ajay Bhutada");
}
This_Calling_Statement (int a)
{
	this(7,'j');
	System.out.println("my mobile number");
}
This_Calling_Statement (int b,char v)
{
	
	System.out.println("123");
	
}
public static void main(String[] args) 
{
	new This_Calling_Statement();
	
}
}

	




