package tech_m;
import java.util.*;
public class maxstring {
	void maxword(String input)
	{
		String words[]=input.split(" ");
		String Maxword=" ";
		for(String a : words)
		{
			if(a.length()>Maxword.length())
			{
				Maxword= a;
			}
		}
		System.out.println(Maxword);
	}
	void strrev(String word)
	{
		System.out.println(word);
		String words[]=word.split(" ");
		for (String a : words)
		{
			StringBuilder sb = new StringBuilder(a);
			StringBuilder fin=sb.reverse();
			System.out.print(fin+ " ");
		}
	}

	public static void main(String[] args) {
		 
         Scanner  sc=new Scanner (System.in);
         System.out.println("enetr  a string");
         String input = sc.nextLine();
         maxstring ob= new maxstring();
        // ob.maxword(input);
ob.strrev(input);
	}

}
