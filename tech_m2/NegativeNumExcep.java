package tech_m2;



public class NegativeNumExcep {
	void method(int a) throws InsufficientFundException
	{
		if(a<0)
		{
			throw new InsufficientFundException ("negative number provided which is not valid ");
		}
		else
		{
			System.out.println("done done bruhhh !!!!");
		}
	}

	public static void main(String[] args) {
		NegativeNumExcep ob = new NegativeNumExcep();
		try {
			ob.method(-34);
		} catch (InsufficientFundException e) {
			
			e.printStackTrace();
		}

	}

}
