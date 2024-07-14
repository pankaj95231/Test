//WAJP ADAM number or not.............??????
import java.util.*;
class Adamnumber
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n,sqr,sqr1,rem,rev=0,rev1=0,temp;
	System.out.println("enter the value of n");
	n=sc.nextInt();
		sqr=n*n;//144
		
		temp=n;
		while(n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	//rev=21;

	sqr1=rev*rev;//441
	
		while(sqr1>0)
	{
		rem=sqr1%10;
		rev1=rev1*10+rem;
		sqr1=sqr1/10;
	}
	//rev1=144

	if(sqr==rev1)

	System.out.println(temp+"is a adam number");

	else

	System.out.println(temp+"is not a adam number");
	}
}