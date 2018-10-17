import java.io.*;
import java.util.*;
class k1
{
	public static void main(String args[])
	{
	int i,n,sum;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
        int a[]=new int[n];
	for(i=1;i<n;i++)
	{
	a[i]=sc.nextInt();
	}sum=1;
	for(i=1;i<n;i++)
	{
	sum=sum*a[i];
	}
	System.out.print(sum);
	
	
	}
}
//product of array elements