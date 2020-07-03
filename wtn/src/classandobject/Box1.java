package classandobject;

public class Box1 {
	int height;
	int width;
	int depth;
	Box1 (int a,int b,int c){
		height = a;
		width = b;
		depth = c;
	}
	int volume() {
		int v = height * width * depth;
		return v;
	}
public static void main(String[] args) {
	Box1 B = new Box1(8,9,7);
	System.out.println("The volume of the box is " + B.volume());
}
}