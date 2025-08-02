import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        
        Queue queue = new Queue(n);

        for (int i = 0; i < n; i++) {
            String cmd = br.readLine();
            if (cmd.startsWith("push")) {
                int x = Integer.parseInt(cmd.split(" ")[1]);
                queue.enqueue(x);
            } else if (cmd.equals("pop")) {
                sb.append(queue.dequeue()).append('\n');
            } else if (cmd.equals("size")) {
                sb.append(queue.size()).append('\n');
            } else if (cmd.equals("empty")) {
                sb.append(queue.isEmpty() ? 1 : 0).append('\n');
            } else if (cmd.equals("front")) {
                sb.append(queue.front()).append('\n');
            } else if (cmd.equals("back")) {
                sb.append(queue.back()).append('\n');
            }
        }
        System.out.print(sb);
    }
}

class Queue {

    private int[] q;
    private int capacity;
    private int num;
    private int front;
    private int rear;

    public Queue(int size) {
        num = front = rear = 0;
        capacity = size;
        q = new int[capacity];
    }

    public int enqueue(int no) {
       
        q[rear++] = no;
        num++;
        if (rear == capacity) rear = 0;
        return no;
    }

    
    public int dequeue() {
        if (num <= 0) return -1;
        int val = q[front++];
        num--;
        if (front == capacity) front = 0;
        return val;
    }

    public int front() {
        if (num <= 0) return -1;
        return q[front];
    }

    public int back() {
        if (num <= 0) return -1;
        int idx = rear == 0 ? capacity - 1 : rear - 1;
        return q[idx];
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }
}

