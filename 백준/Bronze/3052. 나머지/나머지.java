import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] rem = new int[1000]; // 0~41까지 나머지를 체크하기 위한 배열

        for (int i = 0; i < 10; i++) {
            int remainder = sc.nextInt() % 42;
            rem[remainder] = 1; // 해당 나머지 위치에 표시
        }

        int count = 0;
        for (int i = 0; i < 1000; i++) {
            if (rem[i] == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}