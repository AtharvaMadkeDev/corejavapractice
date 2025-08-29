package uss;

public class SumofevennumbersinArray {

	public static void main(String[] args) {
		
		int arr [] = new int [10];
		
		int sum=0;
		
		arr[0]=12;
		arr[1]=15;
		arr[2]=26;
		arr[3]=2;
		arr[4]=20;
		arr[5]=25;
		arr[6]=31;
		arr[7]=14;
		arr[8]=36;
		arr[9]=57;
		
		System.out.println("Odd numbers array :");
		
		for (int i=0; i<10; i++)
		{
			if(arr[i]%2!=0)
			{
			System.out.println(+arr[i]);
			sum=sum+arr[i];
			}
		}
		
		System.out.println("Sum of array = "+sum);
	}


	}



