import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[][] arr = new int[100][100];
        
        for(int i=0;i<n;i++) {
        	int x = sc.nextInt();
            int y = sc.nextInt();
            
            for (int w = x; w < x + 10; w++){
                for (int h = y; h < y + 10; h++){ // 색종이의 길이. 5에서 시작하는 종이라면 5부터 15까지 돌아감 (길이도 10)
                    arr[w][h] = 1;
                }

            }
        }
        
        int area = 0;
        
        for(int i = 0; i < 100; i++){
            for (int j = 0; j < 100; j++){
                if (arr[i][j] == 1){
                    area++;
                }
            }
        }
        System.out.println(area);
	}
}