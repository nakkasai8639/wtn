package flowcontrolstatement;

public class EXP13 {
	public static void main(String args[]) {
		int f=0;
		for(int n=10;n<=99;n++) {
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					f=1;
					break;
				}
			}
		if(f==0)
			System.out.print(n+" ");
		f=0;
		}
	}
}