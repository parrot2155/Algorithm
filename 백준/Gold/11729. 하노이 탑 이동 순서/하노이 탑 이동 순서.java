import java.util.Scanner;

public class Main {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		//2^n - 1
		long moves = ((long) Math.pow(2, no) - 1);
		System.out.println(moves);

		hanoi(no, 1, 3);

		
		System.out.print(sb.toString());
	}

	// n: 원판 개수, x: 시작 기둥, y: 목표 기둥
	public static void hanoi(int n, int x, int y) {
		if (n > 1) {
			hanoi(n - 1, x, 6 - x - y); // 보조 기둥으로
		}

		sb.append(x).append(" ").append(y).append("\n");

		if (n > 1) {
			hanoi(n - 1, 6 - x - y, y);
		}
	}
}