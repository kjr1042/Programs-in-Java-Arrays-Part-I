import java.util.Scanner;

public class evenOddElementsInArray {
	static void evenArray(int a[])
	{
		for (int i=0;i<a.length;i++)
		{
			if(a[i] %2==0)
			{
				System.out.print(a[i] +"  ");
				
			}
		}
		System.out.println();
		System.out.println();
		
		
	}		
	static void oddArray(int a[])
	{
		
		for (int i=0;i<a.length;i++)
		{
			if(a[i] %2 !=0)
			{
				System.out.print(a[i] +"  ");
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int a[]=new int[n];
		for (int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		
		
		evenArray(a);
		
		oddArray(a);
	}

}
