import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            
            if (command.startsWith("1")) {
                int num = Integer.parseInt(command.split(" ")[1]);
                stack.push(num);
            } else if (command.equals("2")) {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append('\n');
            } else if (command.equals("3")) {
                sb.append(stack.size()).append('\n');
            } else if (command.equals("4")) {
                sb.append(stack.isEmpty() ? 1 : 0).append('\n');
            } else if (command.equals("5")) {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append('\n');
            }
        }
        System.out.print(sb);
    }
}