package uss;

public class Primenumbers {

	public static void main(String[] args) {
		int []arr=new int[100];
		//int num=1;
		for(int i=0;i<100;i++)
		{
			arr[i]=i+1;
			boolean flag = false;
			for(int j=2;j<arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					flag=true;
				}
			}
			
		if(flag==true)
		{
			System.out.println(arr[i]+"= Composite");
		}
		else {
			System.out.println(arr[i]+"= Prime");
		}
		}
		

	}

}
