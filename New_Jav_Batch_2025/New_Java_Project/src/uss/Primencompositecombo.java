package uss;

public class Primencompositecombo {

	public static void main(String[] args) {
		int arr [] = new int[50];
		int sum=0;
		for(int i=0;i<50;i++)
		{
			boolean value = false;
			arr[i]=i+2;
			for(int j=2;j<arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					value = true;
				}
			}
			if(value==true)
			{
				System.out.println(arr[i]+"=> Composite");
			}
			else
			{
				System.out.println(arr[i]+"=> Prime");
				sum=sum+arr[i];
				
			}
			
		}
		System.out.println("Sum of prime nos ="+sum);
	}

}
