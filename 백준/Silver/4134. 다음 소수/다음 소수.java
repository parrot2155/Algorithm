import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            long n = sc.nextLong();
            if (n <= 1) n = 2;

            while (true) {
                if (isPrime(n)) {
                    System.out.println(n);
                    break;
                }
                n++;
            }
        }
    }

    public static boolean isPrime(long n) {
    	return BigInteger.valueOf(n).isProbablePrime(10);
    }
}