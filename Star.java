package Guvi;
import java.util.*;
public class Star 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int n=0;
	System.out.println("Enter the number of lines to print");
	n=s.nextInt();
	int l=n*2;
	int k=0;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<l-k;j++)
		{
			if(j==(l-k)/2)
			{
				System.out.print(" ");
			}
			System.out.print("*");
		}
		k+=2;
		System.out.println("\n");
	}
	s.close();
}
}
