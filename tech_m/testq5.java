// question 5

package tech_m;
import java.util.*;
public class testq5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the String1");
		String s1=sc.nextLine();
		System.out.println("enter the String2");
		String s2=sc.nextLine();
		
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1,arr2))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}

}
