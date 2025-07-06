import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int cnt = 0; 

        // 5로 나눠질 때까지 3씩 빼기
        while (n % 5 != 0) {
            n -= 3;
            cnt++; 

            if (n < 0) {
                System.out.println(-1); //안되면 -1
                return;
            }
        }

        cnt += n / 5;

        System.out.println(cnt);
    }
}