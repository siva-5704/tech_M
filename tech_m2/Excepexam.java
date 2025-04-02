package tech_m2;

public class Excepexam  {
	public  void validateage(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("invalid") ;
		}
		else
		{
	     System.out.println("valid to vote");
		}
	}

	public static void main(String[] args) {
		 Excepexam ob = new Excepexam();
		 try {
			ob.validateage(15);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
