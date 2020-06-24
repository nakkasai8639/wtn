package flowcontrolstatement;
import java.util.Scanner;
public class EXP6 {
	public static void main(String[] arg) {
		String gender=arg[0];
		int age=Integer.parseInt(arg[1]);
		if(gender.contentEquals("Female")){
			if(age>0&&age<59) {
				System.out.println("intrest percent is 8.2%");
			}
			else
				System.out.println("intrest percent is 9.2%");
		}
		if(gender.contentEquals("Male")) {
			if(age>0&&age<59) {
				System.out.println("intrest percent is 8.4%");
			}
			else
				System.out.println("intrest percent is 10.5%");
				
			}
		}

}
