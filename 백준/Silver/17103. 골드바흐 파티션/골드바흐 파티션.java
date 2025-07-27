import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 1000000;
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        // 에라토스테네스의 체 (길이가 1000000인 배열 미리 만들어 놓음)
        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;	//i의 배수는 모두 false
                }
            }
        }

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            for (int a = 2; a <= n / 2; a++) {
                if (isPrime[a] && isPrime[n - a]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}