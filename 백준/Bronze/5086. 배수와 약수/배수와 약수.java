import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a == 0 && b == 0) {break;}
		
		String res = "neither";
		
		if(a>b) {
			if(a%b==0) {
				res = "multiple";
			}
		}else if(b>a) {
			if(b%a==0) {
				res="factor";
			}
		}
		
		System.out.println(res);
		}

	}
}