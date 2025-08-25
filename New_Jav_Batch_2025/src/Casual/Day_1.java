package Casual;

public class Day_1 {

	public static void main(String[] args) {
		int [] arr = new int[100];
		
			for(int i=0;i<100;i++)
			{
				arr[i]=i+1;
			}
			for(int i=0;i<100;i++)
			{
				
				if(arr[i]%2==0)
				{
					System.out.println(arr[i]);
				}
			}
		

	}

}

