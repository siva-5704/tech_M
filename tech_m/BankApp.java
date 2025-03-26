package tech_m;
import java.util.*;
public class BankApp {
	int depo = 0;
	int draw = 0;
	int bal = 0;
	Scanner sc = new Scanner (System.in);
	 public void deposit()
	{
		 System.out.println("enter amount to deposit : ");
			depo = sc.nextInt();
			bal = bal+depo;
			System.out.println("deposited sucessfully");
			System.out.println("current balance after deposit is "+ bal);
	}
	 public void withdraw()
	 {
		    System.out.println("enter amount to withdraw : ");
			draw = sc.nextInt();
			if(draw<bal)
			{
			bal = bal-draw;
			System.out.println("withdrawn sucessfully");
			System.out.println("current balance after deposit is "+ bal);
			}
			else
			{
				System.out.println("insufficient balance");
				
			}
			
			
	 }
	 public void balance()
	 {
		 System.out.println("the account balance is" + bal);
		 
		 
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		BankApp ob = new BankApp();
		char ch;
		while (true) {
		System.out.println("enter your choioce for   a : deposit  b : withdraw  c : account_info  d : exit");
		ch = sc.nextLine().charAt(0);
				switch (ch) {
		case 'a' :
		ob.deposit();
		break;
		
		case 'b' :
		ob.withdraw();
		break;
		
		case 'c' :
		ob.balance();
		break;
		
		case 'd' :
			break;
		
		}
		
			
		}
		}
	}


