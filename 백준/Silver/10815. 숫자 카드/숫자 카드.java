import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 상근이의 숫자 카드 입력
        int N = sc.nextInt();
        HashSet<Integer> cards = new HashSet<>();
        for (int i = 0; i < N; i++) {
            cards.add(sc.nextInt());
        }
        
        // 확인할 정수 입력 및 결과 출력
        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int num = sc.nextInt();
            sb.append(cards.contains(num) ? "1" : "0").append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }
}