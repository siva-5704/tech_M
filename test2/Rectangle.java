package test2;

public class Rectangle 
{
	int width;
	int height;
	

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
}
	void area()
	{
		System.out.println("the area of the rectangle is " + (height * width));
	}
	void peri()
	{
		System.out.println("the perimeter of the rectangle is " + (2*(height + width)));
	}


	public static void main(String[] args) {
	Rectangle ob = new Rectangle(15,10);
	ob.area();
	ob.peri();
	}

}
