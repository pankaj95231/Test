import java.util.*;
class Pattren53
{
     public static void main(String args[])
      {
        

     int i,j;
  

   for(i=1;i<10;i++)
   {
      if(i<=5)
        {
       for(j=i;j<=5;j++)
      System.out.print("*");
	System.out.println("");
	}
	else
	{
	for(j=i;j>=5;j--)
	System.out.print("*");
	System.out.println("");
       
        }   
    }

    }
 } 
