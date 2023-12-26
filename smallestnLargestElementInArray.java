import java.util.Scanner;

public class smallestnLargestElementInArray {
	static void largestElement(int a[])
	{
		int max =a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max= a[i];
			}
			
		}
		System.out.println("largest element in the Array : " +max);
	}
	
	static void smallestElement(int a[])
	{
		int min =a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min= a[i];
			}
			
		}
		System.out.println("smallest element in the Array : " +min);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int a[]= new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		
		smallestElement(a);
		largestElement(a);
		

	}

}
