import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Deque dq = new Deque(2000000);

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            if (line.charAt(0) == '1') { 
                int x = Integer.parseInt(line.substring(2));
                dq.pushFront(x);
            } else if (line.charAt(0) == '2') {
                int x = Integer.parseInt(line.substring(2));
                dq.pushBack(x);
            } else if (line.charAt(0) == '3') {
                sb.append(dq.popFront()).append('\n');
            } else if (line.charAt(0) == '4') {
                sb.append(dq.popBack()).append('\n');
            } else if (line.charAt(0) == '5') {
                sb.append(dq.size()).append('\n');
            } else if (line.charAt(0) == '6') {
                sb.append(dq.isEmpty()).append('\n');
            } else if (line.charAt(0) == '7') {
                sb.append(dq.front()).append('\n');
            } else if (line.charAt(0) == '8') {
                sb.append(dq.back()).append('\n');
            }
        }
        System.out.print(sb);
    }
}

class Deque {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Deque(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = rear = capacity / 2;
        size = 0;
    }

    public void pushFront(int x) {
        arr[--front] = x;
        size++;
    }

    public void pushBack(int x) {
        arr[rear++] = x;
        size++;
    }

    public int popFront() {
        if (size == 0) return -1;
        size--;
        return arr[front++];
    }

    public int popBack() {
        if (size == 0) return -1;
        size--;
        return arr[--rear];
    }

    public int size() {
        return size;
    }

    public int isEmpty() {
        return size == 0 ? 1 : 0;
    }

    public int front() {
        if (size == 0) return -1;
        return arr[front];
    }

    public int back() {
        if (size == 0) return -1;
        return arr[rear - 1];
    }
}
