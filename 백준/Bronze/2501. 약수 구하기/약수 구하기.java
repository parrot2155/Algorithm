import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0;
		int res = 1;
		while (res <= n) {
			if (n % res == 0) {
				cnt++;
				if (cnt == k) {
					System.out.println(res);
					return;
				}
			}
			res++;
		}
		System.out.println(0);
	}
}
