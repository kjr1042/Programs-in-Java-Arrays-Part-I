import java.util.Scanner;

public class productOfElementsExcludingIfAnyZeroInArray {

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
			if(a[i]!=0)
			{
				p=p*a[i];
			}
			
//			if(a[i]==0)
//			{
//				continue;
//			}
//			else
//			{
//				p=p*a[i];
//			}
			
		}
		
		System.out.println("Product of Array Elements: "+p);


	}

}
