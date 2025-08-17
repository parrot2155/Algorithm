import java.util.Scanner;

//뽑은 수열이 오름차순
//→ 다음에 뽑을 숫자는 지금 뽑은 숫자보다 큰 수만 가능
//
//DFS 함수에 start 값을 넘겨서
//→ start부터 N까지 반복하도록 만든다ㅐㅣ

public class Main {
	static int n;
	static int m;

	static int[] pick;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		pick = new int[m];

		dfs(0, 1);
		sc.close();
	}

	static void dfs(int depth, int start) {
		if (depth == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(pick[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = start; i <= n; i++) {
			pick[depth] = i;
			dfs(depth + 1, i + 1);
		}

	}

}