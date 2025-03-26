package tech_m;
import java.util.*;
public class PalPrime {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
System.out.println("enter a number to check PAL_PRIME");
int num = sc.nextInt();
int total=num;
int sum=0;
int rev;
int count=0;

while(num!=0)
{
	rev=num%10;
	sum=sum*10+rev;
	num=num/10;
	
}

if(sum==total) {
System.out.println("palindrome number");
}
else
{
	System.out.println("not palindrome");
}
for(int i = 1; i<=total; i++)
{
	if(total%i==0)
	{
		count++;
	}
	
}
if(count==2)
{
	System.out.println("prime number");
}
else
{
	System.out.println("not prime");
}
if(sum==total && count==2)
{
	System.out.println("it is a PAL_PRIME number");
}
else
{
	System.out.println("it is not a PAL_PRIME number");
}
	}

}
