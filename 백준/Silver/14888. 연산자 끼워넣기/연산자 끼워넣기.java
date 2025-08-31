import java.util.Scanner;

public class Main {
    static int n;
    static int[] numbers;
    static int[] oper = new int[4]; // +, -, *, /
    static int maxVal = Integer.MIN_VALUE;
    static int minVal = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        n = sc.nextInt();
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
        	numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
        	oper[i] = sc.nextInt();
        }

        // 첫 번째 숫자부터
        calc(1, numbers[0]);

        System.out.println(maxVal);
        System.out.println(minVal);
    }

    // idx : 몇 번째 숫자를 계산할 차례인지
    // cur : 지금까지의 계산 결과
    
    static void calc(int idx, int cur) {
    	
    	
        // 숫자를 다 썼으면 결과 저장
        if (idx == n) {
            maxVal = Math.max(maxVal, cur);
            minVal = Math.min(minVal, cur);
            return;
        }

        int num = numbers[idx];

        // 연산자 남아있으면 하나씩
        
        if (oper[0] > 0) { // +
            oper[0]--;
            calc(idx + 1, cur + num);
            oper[0]++;
        }
        if (oper[1] > 0) { // -
            oper[1]--;
            calc(idx + 1, cur - num);
            oper[1]++;
        }
        if (oper[2] > 0) { // *
            oper[2]--;
            calc(idx + 1, cur * num);
            oper[2]++;
        }
        if (oper[3] > 0) { // /
            oper[3]--;
            if (cur < 0) {
                calc(idx + 1, -(-cur / num));	//음수를 나누기할때
            } else {
                calc(idx + 1, cur / num);
            }
            oper[3]++;
        }
    }
}
