import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stack = new int[n];
        int top = -1;	//맨 마지막 인덱스

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                top--;  // 맨 마지막 인덱스 --
            } else {
                stack[++top] = num;
            }
        }

        
        int sum = 0;
        for (int i = 0; i <= top; i++) {
            sum += stack[i];
        }
        System.out.println(sum);
    }
}