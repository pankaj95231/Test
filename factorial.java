import java.util.*;
class factorial
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
     int n,i,fact=1;
    System.out.println("enter the value of n");
    n=sc.nextInt();
	
	if(n==0)
		fact=1;
	else
	{
		i=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
	}
    System.out.print("factorial of given number="+fact);
	
    }
 }