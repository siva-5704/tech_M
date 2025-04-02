package test2;
abstract class shape2D
{
	abstract void draw();
	abstract void resize();
}
class Rect extends shape2D
{
	void draw()
	{
		System.out.println("Drawing a rectangle");
	}
	void resize()
	{
		System.out.println("resizing a rectangle");
	}
}
class circ extends shape2D
{
	void draw()
	{
		System.out.println("drawing a circle");
	}
	void resize()
	{
		System.out.println("resizing a circle");
	}
}

public class Draw {

	public static void main(String[] args) {
		
 Rect t = new Rect();
 circ c = new circ();
 t.draw();
 t.resize();
 c.draw();
 c.resize();
		
	}

}
