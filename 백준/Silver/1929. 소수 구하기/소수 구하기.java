import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        for (int num = M; num <= N; num++) {
        	
            if (num <= 1) continue;

            if (num == 2) {
                System.out.println(num);
                continue;
            }
            // 짝수 거르기
            if (num % 2 == 0) continue;
            

            boolean isPrime = true;
            for (long di = 3; di * di <= num; di += 2) {
                if (num % di == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}