import java.util.Scanner;

public class Main {
    static int n, m;
    static boolean[] used;
    static int[] pick;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		used = new boolean[n + 1];
		pick = new int[m];

		dfs(0);
		sc.close();
	}
	
    static void dfs(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(pick[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!used[i]) {
                used[i] = true;
                pick[depth] = i;
                dfs(depth + 1);
                used[i] = false;
            }
        }
    }

    
}