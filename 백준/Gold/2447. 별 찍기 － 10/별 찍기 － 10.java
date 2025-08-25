import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static char[][] board;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        
        board = new char[n][n];
        
        for (int i = 0; i < n; i++) {
        	Arrays.fill(board[i], ' ');
        }
        fill(0, 0, n);

        StringBuilder sb = new StringBuilder(n * (n + 1));
        for (int i = 0; i < n; i++) {
            sb.append(board[i]);
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }

    static void fill(int x, int y, int n) {
        if (n == 1) {
            board[x][y] = '*';
            return;
        }
        int m = n / 3;
        for (int dx = 0; dx < 3; dx++) {
            for (int dy = 0; dy < 3; dy++) {
                if (dx == 1 && dy == 1) {
                	continue;
                }
                fill(x + dx * m, y + dy * m, m);
            }
        }
    }

    
}