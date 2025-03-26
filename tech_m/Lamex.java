package tech_m;

interface A
{
	void show(int a, int b);
}

public class Lamex {
	

	public static void main(String[] args) {
	
		A ob = (int a , int b) -> System.out.println("hello "+ (a+b) );
		ob.show(19,1);
	}

}
