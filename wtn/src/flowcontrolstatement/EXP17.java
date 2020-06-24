package flowcontrolstatement;

public class EXP17 {
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		int s=n,org=0,r;
		while(s!=0){
		r=s%10;
		org=org*10+r;
		s=s/10;
		}
		if(n==org)
		System.out.println("palindrome");
		else
		System.out.println("Not a palindrome");
	}
}