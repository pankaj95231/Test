import java.util.*;
class Pattern29
{
      public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
         int n,i,j;
    System.out.println("Enter the value of n");
    n=sc.nextInt();
        
    for(i=1;i<=n;i++)
   {
   for(j=1;j<=n-1;j++)
   System.out.print(" ");

   for(j=i;j>=1;j--)
   System.out.print(j);
   
   System.out.println("");
   
    }
    
   }
}
