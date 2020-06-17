package Arrays;
import java.util.Scanner;
public class EX2 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n,i,max,min;
		System.out.println("Enter size of array:");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter elements in the array");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
		max=a[0];min=a[0];
		for(i=0;i<n;i++) {
			if(max<a[i])
				max=a[i];
		   else if(min>a[i])
		        min=a[i];
		}
		System.out.println("max value is:"+max);
		System.out.println("min value is:"+min);
	}
}