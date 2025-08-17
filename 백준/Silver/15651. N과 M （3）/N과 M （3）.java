import java.util.Scanner;

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
		
		dfs(0);

		System.out.print(sb.toString());
	}

	static void dfs(int depth) {
		
		if (depth == m) { // 수열의 길이 m개를 다 채웠을 때
			for (int i = 0; i < m; i++) {
				sb.append(pick[i]).append(" "); // 지금까지 뽑아둔 pick 배열의 내용을 sb에 추가
			}
			
			sb.append("\n");
			return;
		}

		for (int i = 1; i <= n; i++) {
			pick[depth] = i; // 중복 허용함
			dfs(depth + 1); // 다음 자리(depth+1)로 넘어간다. 과정 반복하면서 길이 m짜리 수열 만듦
		}
	}

}