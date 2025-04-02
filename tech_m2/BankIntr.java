package tech_m2;
abstract class intrest
{
	abstract void getintr();
}
class SBI extends intrest
{

	@Override
	void getintr() {
		int r=5;
		System.out.println("intrest of the SBI bank is "+ r +"%");
		
	}
	
}
class KOTAK extends intrest
{

	@Override
	void getintr() {
		int r = 8;
		System.out.println("the intrest of KOTAk bank is "+ r +"%");
		
	}
	
}
public class BankIntr {

	public static void main(String[] args) {
	SBI ob1 = new SBI();
	KOTAK ob2 = new KOTAK();
	ob1.getintr();
	ob2.getintr();

	}

}
