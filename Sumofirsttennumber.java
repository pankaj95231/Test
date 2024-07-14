import java.util.*;
class Sumofirsttennumber
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
     int i,n, sum=0;
    System.out.println("enter the value of n");
    n=sc.nextInt();
	
	i=1;
	while(i<=n)
	{
		sum=sum+i;
		i++;
    System.out.print(sum);
	i++;
	}
    }
 }