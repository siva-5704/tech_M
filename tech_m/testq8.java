// question 8

package tech_m;
import java.util.*;
public class testq8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter Average marks of a student to find Grade : ");
		int AVG=sc.nextInt();
		if(AVG >=80 )
		{
			System.out.println("A grade");
		}
		else if(AVG>=60 && AVG<80)
		{
			System.out.println("B grade");
		}
		else if(AVG>=40 && AVG<60)
		{
			System.out.println("C grade");
		}
		else
		{
			System.out.println("D grade");
		}
		
		
	}

}
