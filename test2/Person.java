package test2;

class Person 
{
	String name;
	int age;
	

Person(String name, int age) {
		this.name = name;
		this.age = age;
}
void display()
{
	System.out.println(name +" " + age);
	System.out.println(" ");
}


public static void main(String[] args) {
		Person ob1 = new Person("shiva" , 21);
		Person ob2 = new Person("Giridhar" , 27);
		ob1.display();
		ob2.display();
	}

}
