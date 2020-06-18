package Arrays;

public class EX5 {
	public static void main(String args[])
	{
	int a[] = {65,120,98,75,115};
	int i, max1, max2, min1, min2;
	int N = a.length;
	max1 = a[0];
	max2=a[0];
	for(i=0;i<N; i++){
		if(a[i]> max1)
			max1 = a[i];}
	for(i=0; i<N; i++){
		if(a[i]>max2 && a[i]!=max1)
			max2= a[i];
		}
	int first,second;
	first = second = Integer.MAX_VALUE; 
	        for (i = 0; i < N ; i ++) 
	        { 
	            if (a[i] < first) 
	            { 
	                second = first; 
	                first = a[i]; 
	            } 
	            else if (a[i] < second && a[i] != first) 
	                second = a[i]; 
	        }
	System.out.println("Largest 2 numbers are: "+max1+" "+max2);
	System.out.println("Smallest 2 numbers are: "+first+" "+second);
	}
}