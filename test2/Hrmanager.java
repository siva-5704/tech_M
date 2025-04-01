package test2;
class Emp
{
	int salary;
	void work()
	{
		System.out.println("working");
	}
	int getsal(int salary)
	{
		return salary;
	}
}
public class Hrmanager extends Emp {
 void work()
 {
	 System.out.println("Not working");
 }
 void addemp()
 {
	 System.out.println("new employee is being added");
 }
	
	public static void main(String[] args) {
		Emp ob1 = new Emp();
		Hrmanager ob2 = new Hrmanager();
		ob1.work();
		System.out.println(ob1.getsal(15000));
		ob2.work();
		ob2.addemp();

	}

}
