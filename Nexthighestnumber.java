//WAJP find next highest number which is  less then the given number without the digit enter by the user....?
import java.util.*;
class Nexthighestnumber
{
		public static void main(String args [])
  		{

		Scanner sc=new Scanner(System.in);
		
		int n,nexthighestnumber,temp,rev,rem,digit;
		boolean flag=false;
	System.out.println("enter the value of n ");
	n=sc.nextInt();

	System.out.println("enter the digit ");
	digit=sc.nextInt();
	
	nexthighestnumber=n-1;


	for(;nexthighestnumber>0;)
	{
	temp=nexthighestnumber;
	flag=false;
	while(temp>0)
	{
	rem=temp%10;
	if(rem==digit)
	{
	flag=true;
	break;
	}
	temp=temp/10;
	}
	if(!flag)
	break;

	nexthighestnumber--;

	}
	
	if(nexthighestnumber>0)
	
	System.out.println("nexthighestnumber");

	
	
	}

}
	

	                                                         