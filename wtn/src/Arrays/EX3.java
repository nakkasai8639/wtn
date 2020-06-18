package Arrays;
import java.util.Scanner;
public class EX3 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n,i,num,flag=0;
		System.out.println("Enter size of array:");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter elements in the array:");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
		System.out.println("Enter the value to be checked:");
		num=sc.nextInt();
		for(i=0;i<n;i++) {
			if(num==a[i]) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
			if(flag==1) 
				System.out.println("index of value is:"+i);
			else
			System.out.println("-1");
			}
}
