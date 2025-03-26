package tech_m;

public class arrayunique {

		public static void main(String[] args) {
			int arr[]= {1,2,5,4,5,1,2};

			
			for(int i=0; i<arr.length; i++)
			{
				int count=0;
				for(int j=0;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						
					}				
			}
				if(count==1)
				{
					System.out.println(arr[i] + " is unique");
				}
				
	}
		}
}
