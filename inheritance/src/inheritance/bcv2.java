package inheritance;

public class bcv2 extends bcv1 {
public static int mul(int x,int y) {
		
		return x*y;
	}
public static double div(int a ,int b) {
		
		return a/b;

}
	public static void main(String[] args) {
		
		System.out.println(bcv2.div(6, 2));
		System.out.println(bcv2.add(5, 2));
		System.out.println(bcv2.sub(5, 2));
		System.out.println(bcv2.mul(2,8));
		
	
		
	}
}

