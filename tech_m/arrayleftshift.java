package tech_m;
import java.util.*;
public class arrayleftshift {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int first=arr[0];
		int i;
		for(i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[i]=first;
		for(i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]);
		}
		
	}

}
