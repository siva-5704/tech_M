// question 3

package tech_m;
import java.util.*;
public class testq3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 words");
		
		String s1= sc.nextLine();
		String s2= sc.nextLine();
		String s3= sc.nextLine();
		
		String str1 = s1.replaceAll("[AEIOUaeiou]", "*");
		String str2 = s2.replaceAll("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]", "@");
		String str3 = s3.toUpperCase();
		
		System.out.println(str1+str2+str3);
	}

}