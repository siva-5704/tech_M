package tech_m2;

public class Overloadex {
	static void add (int a , int b)
	{
		System.out.println(a+b);
		
	}
	static void add (int a, int b, int c)
	{
		int sum=a+b+c;
		
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		
		Overloadex.add(12, 13);
		
	}

}
