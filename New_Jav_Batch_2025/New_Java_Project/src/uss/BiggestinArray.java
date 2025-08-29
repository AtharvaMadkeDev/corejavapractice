package uss;

public class BiggestinArray {

	public static void main(String[] args) {
		int arr [] = new int [5];
		int temp=0;
		arr[0]=12;
		arr[1]=15;
		arr[2]=26;
		arr[3]=2;
		arr[4]=20;
		System.out.println("Array :");
		for (int i=0; i<5; i++)
		{
			
			System.out.println(arr[i]);
			if(arr[i]>temp)
			{
				
				temp=arr[i];
			}
			
		}
		System.out.println("Highest number :");
		System.out.println(temp);
	}

}
