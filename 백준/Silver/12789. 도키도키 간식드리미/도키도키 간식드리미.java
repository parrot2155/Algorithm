import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 학생 수
        Queue<Integer> line = new LinkedList<>(); 
        Stack<Integer> space = new Stack<>(); 

        for (int i = 0; i < n; i++) {
            line.add(sc.nextInt());
        }

        int idx = 1; // 현재 간식을 받아야 하는 번호
        while (!line.isEmpty() || !space.isEmpty()) {
            // 큐의 맨 위가 현재 번호와 일치
            if (!line.isEmpty() && line.peek() == idx) {
                line.poll();
                idx++;
            }
            // 스택의 맨 앞이 현재 번호와 일치
            else if (!space.isEmpty() && space.peek() == idx) {
                space.pop();
                idx++;
            }
            // 큐의 맨 앞을 스택으로 이동
            else if (!line.isEmpty()) {
                space.push(line.poll());
            }
            // 불가능
            else {
                System.out.println("Sad");
                return;
            }
        }

        System.out.println("Nice");
    }
}
