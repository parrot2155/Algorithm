import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt(); 
        sc.nextLine(); 

        char[][] board = new char[x][y];

        for(int i=0;i<x;i++) {
            board[i] = sc.nextLine().toCharArray();
        }

        int min = 64;
        
        
        for(int i=0;i<=x-8;i++) {
            for(int j=0;j<=y-8;j++) {
                int count = countBoard(board, i, j);
                if(count<min) {
                    min = count;
                }
            }
        }
        System.out.println(min);
    }

    public static int countBoard(char[][] board, int startX, int startY) {
        int countW = 0;
        int countB = 0;

        for(int i=startX;i<startX+8;i++) {
            for(int j=startY;j<startY+8;j++) {
                char now = board[i][j];

                if ((i+j)%2 == 0) {
                    if(now != 'W') {
                    	countW++; 
                    }
                    if(now != 'B') {
                    	countB++;
                    }
                } else {
                    if(now != 'B') {
                    	countW++;
                    }
                    if(now != 'W') {
                    	countB++;
                    }
                }
            }
        }
        return Math.min(countW, countB);
    }
}