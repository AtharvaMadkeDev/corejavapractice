package uss;

public class NewBool {
public static void main(String[]args) {
	int i;
	int num=151;
	boolean flag=false;
	
		
		for(i=2;i<13;i++)
		{
		      if(num%i==0)
		      {
		    	  flag=true;
		      }
		}
		if(flag==true)
		{
		System.out.println("Composite");
		}
	else {
		System.out.println("Prime");
	}

}
}
