package flowcontrolstatement;

public class EXP3 {
	public static void main(String[] arg){ 
		int i=0;
		if(arg.length==0)
			System.out.println("No value");
		else
			for(i=0;i<arg.length;i++)
				System.out.println(arg[i]+",");
}
}
