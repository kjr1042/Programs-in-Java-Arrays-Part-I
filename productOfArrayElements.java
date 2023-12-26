import java.util.Scanner;

public class productOfArrayElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		int p=1;
		for(int i=0;i<a.length;i++)
		{
			p=p*a[i];
		}
		
		System.out.println("Product of Array Elements: "+p);

	}

}
