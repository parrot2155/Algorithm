import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		
		if(a>=(b+c)) {
			a = (b+c)-1;
		}else if(b>=(a+c)) {
			b = (a+c)-1;
		}else if(c>=(a+b)) {
			c = (a+b)-1;
		}
		System.out.println(a+b+c);
	}
}