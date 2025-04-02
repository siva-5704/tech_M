package tech_m2;
class Animal
{
	void display()
	{
		System.out.println("this is an animal");
	}
	void breed(String br)
	{
		System.out.println("this is "+ br+ "  breed");
	}
}
class Dog extends Animal
{
	void display()
	{
		super.display();
		System.out.println("this is a dog");
	}
	void sound()
	{
		System.out.println("bow bow vow vow");
	}
}
public class Overrideex {

	public static void main(String[] args) {
		Dog ob = new Dog();
		ob.display();
		ob.breed("cubs");
		ob.sound();

	}

}
