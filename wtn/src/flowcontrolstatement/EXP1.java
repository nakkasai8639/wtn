package flowcontrolstatement;
import java.util.Scanner;
public class EXP1 {
	public static void main(String[] arg){ 
		 int n;
	        Scanner s = new Scanner(System.in);
	        n = s.nextInt();
	        if(n > 0)
	        {
	            System.out.println("Positive");
	        }
	        else if(n < 0)
	        {
	            System.out.println("Negative");
	        }
	        else
	        {
	            System.out.println("Zero ");
	        }
	    }
	}