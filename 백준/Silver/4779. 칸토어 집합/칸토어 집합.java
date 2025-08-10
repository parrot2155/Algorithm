//제 귀여운 재귀 함수 보실래요/?
import java.util.Scanner;

public class Main {
    static void cantor(char[] arr, int start, int length) {
        if (length == 1) return;
        int third = length / 3;

        for (int i = start + third; i < start + 2 * third; i++) {
            arr[i] = ' ';
        }
        cantor(arr, start, third);
        cantor(arr, start + 2 * third, third);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int length = (int) Math.pow(3, n);
            char[] arr = new char[length];

            for (int i = 0; i < length; i++) arr[i] = '-';
            cantor(arr, 0, length);
            System.out.println(new String(arr));
        }
    }
}