import java.util.*;
class Reverse
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
     int rem,n, rev=0;
    System.out.println("enter the value of n");
    n=sc.nextInt();
	
	while(n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}	
    System.out.print("reverse of given number="+rev);
	
    }
 }