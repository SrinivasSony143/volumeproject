package volume;
import java.util.*;
public class demo8 {
	public static void main(String args[])//find out  the sides of cube
	{
try{

		Scanner s=new Scanner(System.in);
		System.out.println("enter no of cubes to find volume");

	int	n=s.nextInt();
	int i,c,k;
		for(i=0;i<n;i++)
		{ 
		
		
			System.out.println("enter side of cube");
			k=s.nextInt();
			volume1 l=new volume1();
			c=l.vol(k);
			System.out.println(c);
		}
	
}
catch(Exception e)
{
System.out.println(e);
}
}
}
class volume1
{
	public int vol(int a)
	{
		int v;
	v=a*a*a;
	return v;
	}
}
