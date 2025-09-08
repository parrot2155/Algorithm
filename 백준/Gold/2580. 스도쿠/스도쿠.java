import java.util.Scanner;

public class Main {

    static int[][] board = new int[9][9];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        solveSudoku(0, 0);
    }

    static void solveSudoku(int row, int col) {
        // 모든 칸을 탐색 완료하면 스도쿠 완성
        if (row == 9) {
            printBoard();
            System.exit(0); // 첫 번째 해를 찾으면 종료
        }

        int nextRow = row;
        int nextCol = col + 1;
        
        // 다음 칸의 좌표 계산 (다음 열이 9이면 다음 행으로 이동)
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // 현재 칸이 비어있지 않은 경우, 다음 칸으로 재귀 호출
        if (board[row][col] != 0) {
            solveSudoku(nextRow, nextCol);
            return;
        }

        // 현재 칸이 빈칸(0)인 경우
        for (int num = 1; num <= 9; num++) {
            if (isValid(row, col, num)) {
                board[row][col] = num;
                solveSudoku(nextRow, nextCol);
                board[row][col] = 0;
            }
        }
    }

    private static boolean isValid(int row, int col, int num) {
        // 가로, 세로, 3x3 블록 규칙 검사
        // 가로줄 검사
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }
        // 세로줄 검사
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }
        // 3x3 블록 검사
        int startRow = row / 3 * 3;
        int startCol = col / 3 * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void printBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
