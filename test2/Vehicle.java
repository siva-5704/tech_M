package test2;

 class Vehicle1
{
	void drive()
	{
		System.out.println("im in vehicle");
	}
}

class Car1 extends Vehicle1 
{
	void drive()
	{
		System.out.println("repairing a car");
	}
}
class Vehicle{

	public static void main(String[] args) {
		Car1 ob = new Car1();
		ob.drive();
		

	}
	}


