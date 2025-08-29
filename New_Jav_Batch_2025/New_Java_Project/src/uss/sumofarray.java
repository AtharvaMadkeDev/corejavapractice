package uss;

public class sumofarray {

	public static void main(String[] args) {
		int arr [] = new int [5];
		
		int sum=0;
		
		arr[0]=12;
		arr[1]=15;
		arr[2]=26;
		arr[3]=2;
		arr[4]=20;
		System.out.println("Array :");
		for (int i=0; i<5; i++)
		{
			
			System.out.println(arr[i]);
			sum=sum+arr[i];
			
		}
		System.out.println("Sum of array = "+sum);
	}


	}


