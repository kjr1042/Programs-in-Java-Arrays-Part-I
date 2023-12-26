import java.util.Scanner;

public class ArrayRange_first_To_last_To_first_To_middle_To_last {
	static void firstToMiddle(int []a)
	{
		int sum=0;int p=1;
		for(int i=0;i<a.length/2;i++)
		{
			System.out.print(a[i] +" ");
			
			sum=sum+a[i];
			p=p*a[i];
		}
		System.out.println();
		System.out.println("Sum: "+sum);
		System.out.println("Product: "+p);
		System.out.println();
	}
	static void middleToLast(int []a)
	{
		for(int i=a.length/2;i<a.length;i++)
		{
			System.out.print(a[i] +" ");
		}
		System.out.println();
	}
	static void lastToFirst(int []a)
	{
		int sum=0;int p=1;
		System.out.println();
		for(int i=a.length-1;i>=0;i--)
		{
			
			System.out.print(a[i] +" ");
			
			sum=sum+a[i];
			p=p*a[i];
		}
		System.out.println();
		System.out.println("Sum: "+sum);
		System.out.println("Product: "+p);
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		
		firstToMiddle(a);
		middleToLast(a);
		lastToFirst(a);

	}

}
