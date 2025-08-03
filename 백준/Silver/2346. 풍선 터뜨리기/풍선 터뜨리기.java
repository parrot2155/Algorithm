import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] balloon = new int[n][2];
        for (int i = 0; i < n; i++) {
        	balloon[i][0] = i + 1;      // 풍선번호
        	balloon[i][1] = sc.nextInt(); // 종이에 쓰여진 이동값
        }

        
        
        Deque dq = new Deque(2000);
        for (int i = 0; i < n; i++) {
            dq.pushBack(i);
        }
        
        

        StringBuilder sb = new StringBuilder();

        while (!dq.isEmpty()) {
            int idx = dq.popFront();  // 현재 풍선
            sb.append(balloon[idx][0]).append(' ');

            if (dq.isEmpty()) break;

            int move = balloon[idx][1];
            if (move > 0) {
                // 오른쪽 (move-1)번
                for (int i = 0; i < move - 1; i++) {
                    dq.pushBack(dq.popFront());
                }
            } else {
                // 왼쪽 -move)번
                for (int i = 0; i < -move; i++) {
                    dq.pushFront(dq.popBack());
                }
            }
        }
        System.out.println(sb);
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
        front = 0;
        rear = 0;
        size = 0;
    }

    public void pushFront(int x) {
        front = (front - 1 + capacity) % capacity;
        arr[front] = x;
        size++;
    }

    public void pushBack(int x) {
        arr[rear] = x;
        rear = (rear + 1) % capacity;
        size++;
    }

    public int popFront() {
        if (size == 0) return -1;
        int ret = arr[front];
        front = (front + 1) % capacity;
        size--;
        return ret;
    }

    public int popBack() {
        if (size == 0) return -1;
        rear = (rear - 1 + capacity) % capacity;
        int ret = arr[rear];
        size--;
        return ret;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int front() {
        if (size == 0) return -1;
        return arr[front];
    }

    public int back() {
        if (size == 0) return -1;
        return arr[(rear - 1 + capacity) % capacity];
    }
}
