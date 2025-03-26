package tech_m;
import java.util.*;
public class arraycomparison {

	public static void main(String[] args) {
		int arr1[]= new int[5];
		int arr2[]= new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter 5 elements into array1");
				
		for(int i=0; i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("eneter 5 elements into array2");
		
		for(int i=0; i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println("array 1 elements are");
		for(int a:arr1)
		{
			System.out.println(a);
		}
		System.out.println("array 2 elements are");
		for(int a:arr2)
		{
			System.out.println(a);
		}
		
		if(arr1[0]==arr2[arr2.length-1])
		{
			System.out.println("1st of arr1 and last element of arr2 are equal");
		}

		else if(arr1[0]>arr2[arr2.length-1])
		{
			System.out.println("1st element of arr1 is greater than last element of arr2");
		}

		else if(arr1[0]<arr2[arr2.length-1])
		{
			System.out.println("1st element of arr1  is lesser than last element of arr2");
		}
		else
		{
			System.out.println("try again");
		}
	}

}
