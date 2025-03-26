// question 10

package tech_m;
import java.util.*;
public class testq10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter A Character (A-Z) ");
		char ch = sc.nextLine().toLowerCase().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' )
		{
			System.out.println(ch + " is a vowel ");
		}
		else
		{
			System.out.println(ch +" is a consonant");
		}
		
	}

}
