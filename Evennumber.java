import java.util.*;
class Evennumber
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
     int i,n;
    System.out.println("enter the value of n");
    n=sc.nextInt();
	
	i=1;
	while(i<=n)
	{
		if(i%2==0)
    System.out.print(i+" ");
	i++;
	}
    }
 }