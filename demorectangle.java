class shape
{
	public void display ()
	{
	System.out.print("this is a shape");

	}
}
class rectangle extends shape
{
	public void display()

{
	System.out.print("this is a rectangle");
}

	public void increasedlength()
	{

	System.out.print("the length is increased");
}
}
class demorectangle
{
	public static void main(String args[])

{

	
	shape s;
s = new rectangle();
s.display();
//s.increaselength(); 
}
}

