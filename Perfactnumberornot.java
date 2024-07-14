// write a java program to find the perfact number or not ...?
import java.util.*;
class Perfactnumberornot
{
	public static void main(String args[])
	{
	
	Scanner sc=new Scanner(System.in);
	int i,n,sum=0;

	System.out.println("enter the value of n");
	n=sc.nextInt();
		
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			sum=sum+i;
 
	}
	if(n==sum)
		System.out.println("perfact number");
		else
		System.out.println(" not a perfact number");
	}
}