package test2;
abstract class shape
{
	abstract void area();
	abstract void perimeter();
}
class triangle extends shape
{
	void area()
	{
		System.out.println("this is area of triangle");
	}
	void perimeter()
	{
		System.out.println("this is perimeter of traingle");
	}
}
class circle extends shape
{
	void area()
	{
		System.out.println("this is area of circle");
	}
	void perimeter()
	{
		System.out.println("this is perimeter of circle");
	}
}

public class Calc {

	public static void main(String[] args) {
		
 triangle t = new triangle();
 circle c = new circle();
 t.area();
 t.perimeter();
 c.area();
 c.perimeter();
		
	}

}
