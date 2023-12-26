import java.util.Scanner;

public class averageOfArrayELements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		float avg=0;int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			int NoOfElements =a.length;
			avg =sum/NoOfElements;
		}
		
		System.out.println(avg);

	}

}
