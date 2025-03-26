package tech_m;
import java.util.*;
public class arraydemo {
public static void main(String args[]) {
	int arr[]= new int[5];
	
	Scanner sc=new Scanner(System.in);
	System.out.println("eneter 5 elements into array");
			
	for(int i=0; i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int a:arr)
	{
		System.out.println(a);
	}
	Arrays.sort(arr);
	System.out.println("sorted elements of array are");
	for(int a:arr)
	{
		System.out.println(a);
	}
	System.out.println("1st largest element is"+ arr[arr.length-1]);
	System.out.println("2nd largest element is"+ arr[arr.length-2]);
	System.out.println("3rd largest element is"+ arr[arr.length-3]);
	
	
}
}
