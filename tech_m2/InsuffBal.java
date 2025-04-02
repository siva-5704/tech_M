package tech_m2;



public class InsuffBal {
	void method(int a) throws InsufficientFundException 
	{
		int bal = 1000;
		if(a>bal)
		{
			throw new InsufficientFundException ("INSUFFICIENT BALANCE ");
		}
		else
		{
			System.out.println("done done bruhhh !!!!");
		}
	}

	public static void main(String[] args) {
		InsuffBal ob = new InsuffBal();
		try {
			ob.method(100);
		} catch (InsufficientFundException  e) {
			
			e.printStackTrace();
		}

	}

}
