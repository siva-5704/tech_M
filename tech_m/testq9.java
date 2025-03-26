// question 9

package tech_m;
import java.util.*;
public class testq9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter height of a person : ");
		float  height=sc.nextFloat();
	    System.out.println("enter weight of a person : ");
		int weight=sc.nextInt();
		if(height >=5.5 && weight >55)
		{
			System.out.println("person is eligible for physical test");
		}
		else
		{
			System.out.println("person is not eligible for physical test");
		}
		
		
	}

}
