package flowcontrolstatement;

public class EXP14 {
	public static void main(String args[]){
        int num=1234;
        int rem=0, sum=0, temp;
        temp = num;	
        while(num>0){
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }		
        System.out.print(sum);        
    }
}