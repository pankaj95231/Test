// write a java program each reads a setbof numbers stil we enter 0 and calucate avrage ...?
import java.util.*;
class Averagenumber
{
	public static void main(String args[])
	{
	
	Scanner sc=new Scanner(System.in);
	int i,n,num,count=0;
	float avg,sum=0.0f;


	System.out.println("enter the value of n");
	n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{

	
	System.out.println("enter the value of number");
	num=sc.nextInt();
 
		if(num==0)
		break;
	else
	{
		sum=sum+num;
		count++;
		}
	}
	avg=sum/count;
		System.out.println("Average="+avg);
		
	}
}

		