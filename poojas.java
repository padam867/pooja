import java.io.*;
import java.util.*;
class poojas
{
	public static void main(String args[])
	{
	int n;
	Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       int a[]=new int[n];
	for(int i=1;i<n;i++)
	{
	a[i]=sc.nextInt();
	}
        System.out.print("ORI");
        for(int i=1;i<n;i++)
	{
	System.out.print(a[i]);
	}
       System.out.print(" the");
	for(int i=1;i<n;i+=2)
	{
	System.out.print(a[i]);
	}
	}	
}