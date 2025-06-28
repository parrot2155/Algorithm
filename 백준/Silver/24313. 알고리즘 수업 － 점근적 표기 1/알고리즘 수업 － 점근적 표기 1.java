import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a0 = sc.nextInt(); 
		int a1 = sc.nextInt(); 
		int c = sc.nextInt();
		int n0 = sc.nextInt();

		int res = 1;

		for (int n = n0; n <= 100; n++) {
			int fn = a0 * n + a1;
			int cn = c * n;

			if (fn > cn) {
				res = 0;
				break;
			}
		}

		System.out.println(res);
	}
}