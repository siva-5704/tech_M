// question 11

package tech_m;
import java.util.*;
public class testq11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter a number from 1 to 100 ");
		int n=sc.nextInt();
		if(n>100)
		{
			System.out.println("number is greater than 100 ");
			
		}
		if(n>=1 && n<=100)
		{
			
		if(n%2!=0 )
		{
			System.out.println(n + "is odd");
		}
		else
		{
			if(n>=2 && n<=5)
			{
			System.out.println("not weird");
		    }
		
			else if(n>=6 && n<=20)
		    {
			System.out.println("wweird");
		    }
		    else if(n>20)
		    {
			System.out.println("not weird");
		    }   
		}
		
	}

}
}
