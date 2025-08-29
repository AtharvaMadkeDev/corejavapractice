package uss;

public class TwodArray123 {

	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		int temp=1;
		for(int i=0;i<4;i++)
		{
			
			for(int j=0;j<4;j++)
			{
				
				arr[i][j]=i+j;
				System.out.print(temp+" ");
				temp++;
			}
			System.out.println();
		}

	}

}
