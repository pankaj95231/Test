import java.util.*;
class Studentgrade
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	char 
	
	grade=sc.next().charAt(0);
switch(grade)
{
 
case 's' :
case 'S' : System.out.print("Excellent");
	   break;
case 'a' :
case 'A' : System.out.print("very good");
	   break;
case 'b' :
case 'B' : System.out.print("good");
	   break;
case 'c' :
case 'C' : System.out.print("poor");
	   break;
case 'y' :
case 'Y' : System.out.print("absent");
	   break;
case 'f' :
case 'F' : System.out.print("fail");
	   break;
default : System.out.print("invaild grade");
	}
	
   }

}

	