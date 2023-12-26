import java.util.Scanner;

public class elementsPresentInEvennOddIndexes {
	static void evenIndexArray(int a[])
	{
		for (int i=0;i<a.length;i++)
		{
			if(i %2==0)
			{
				System.out.print("index " + i +" : "+a[i] +"  ");
				
			}
		}
		
		
	}		
	static void oddIndexArray(int a[])
	{
		
		for (int i=0;i<a.length;i++)
		{
			if(i %2 !=0)
			{
				System.out.print("index " + i +" : "+a[i] +"  ");
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
		
		
		evenIndexArray(a);
		
		oddIndexArray(a);

	}

}
