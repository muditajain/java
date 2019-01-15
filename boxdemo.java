import java.util.*;
class box
{
	double width,w;
	double height,h;
	double depth,d;

	void setdim()
	{
	w=width;
	h=height;
	d=depth;

	}
	double volume()
	{
	return w*h*d;
	}

}
class boxdemo
{
	public static void main(String args[])
	{
	double vol;
	Scanner input=new Scanner(System.in);
		box b1=new box();
	System.out.print("enter values for box");
	b1.width=input.nextint();
	b1.depth=input.nextint();
	b1.depth=input.nextint();
b1.setdim();
vol=b1.volume();
System.out.print("volume is"+ vol);
	}
}