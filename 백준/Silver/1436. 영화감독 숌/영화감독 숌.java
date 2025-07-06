import java.util.Scanner;

public class Main {

    // 숫자에 666이 연속으로 포함되어 있는지
    public static boolean contains666(int num) {
        // 숫자를 계속 10으로 나누면서 3자리씩 판별
        while (num >= 100) {
            int lastThree = num % 1000;
            if (lastThree == 666) {
                return true;
            }
            num /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int number = 666;

        while (true) {				//666이 들어있으면 ++, 아니면 다시 반복
            if (contains666(number)) {
                count++;
                if (count == n) {
                    System.out.println(number);
                    break;
                }
            }
            number++;
        }
    }
}