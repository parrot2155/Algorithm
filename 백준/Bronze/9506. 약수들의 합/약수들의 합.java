import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		while (true) {
			n = sc.nextInt();
			if (n == -1) {
				break;
			}  // -1 입력하면 종료

			int sum = 0;
			
			StringBuilder sb = new StringBuilder();

			for (int i = 1; i <= n/2; i++) {  //n/2 => 자기 자신도 더해지는 경우를 제외.
				if (n % i == 0) {
					sum += i;
					sb.append(i).append(" + ");
				}
			}

			if (sum == n) {
				// 마지막 + 제거
				System.out.println(n + " = " + sb.substring(0, sb.length() - 3));
			} else {
				System.out.println(n + " is NOT perfect.");
			}
		}
	}
}