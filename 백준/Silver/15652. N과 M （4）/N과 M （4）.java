import java.util.Scanner;

//중복 O, 조합(비내림차순) → start부터 진행

public class Main {
	static int n;
	static int m;
	static int[] pick;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		pick = new int[m];
		dfs(0, 1); // depth=0, start=1부터

		System.out.print(sb.toString());
	}

	static void dfs(int depth, int start) {
		
		if (depth == m) { // M개 뽑으면 출력
			for (int i = 0; i < m; i++) {
				sb.append(pick[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = start; i <= n; i++) {
			pick[depth] = i; // 현재 자리 선택
			dfs(depth + 1, i); // i부터 다시 시작 , 중복 허용
		}
	}

}