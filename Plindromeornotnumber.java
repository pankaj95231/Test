import java.util.*;
class Plindromeornotnumber
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n,rem,temp,rev=0;
	System.out.println("enter the value of n");
	n=sc.nextInt();
		temp=n;
	
		while(n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
		if(temp==rev)

	System.out.println(temp+" is a pelindrome");

	else

	System.out.println(temp+" is not a pelindrome");
	}
}