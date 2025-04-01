package test2;
 class Bank
{
int accno;
int bal;
String name;
Bank(int accno, int bal, String name) {
	this.accno = accno;
	this.bal = bal;
	this.name = name;
}
	void deposit(int depamt)
	{
		bal+=depamt;
		System.out.println("deposited successfully into account number :"+accno + name);
		
	}
	void withdraw(int witamt)
	{
		if(witamt<bal) {
		bal-=witamt;
		System.out.println("withdrawn successfully from account number :"+accno + name);
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}
	void balance()
	{
		System.out.println("the account balaance "+ bal);
	}
}

	class Intrest extends Bank
	{
		double intrestRate;
		Intrest(int accno, int bal, String name, double intrestRate )
		{
			super( accno,  bal, name);
			this.intrestRate = intrestRate;
			
		}

		void Intr(double no)
		{
			bal+= bal *(intrestRate/100);
			System.out.println("bal after intrest" +bal);
		}
	
	
	public static void main(String[] args) {
	Bank ob =  new Bank(123,1000,"shiva");
	Intrest ob2 = new Intrest(1,10000,"giri",0.8);
	ob.deposit(500);
	ob.balance();
	ob.withdraw(1000);
	ob.balance();
	ob2.Intr(0.7);
	}
	
}