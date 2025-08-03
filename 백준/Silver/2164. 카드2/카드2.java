import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue q = new Queue(n);

        for (int i = 1; i <= n; i++) {	//큐에 넣기
            q.enqueue(i);
        }
       
        while (q.size() > 1) {
            q.dequeue();            // 제일 위 버림
            int toBottom = q.dequeue(); // 맨 아래로
            q.enqueue(toBottom);
        }

        System.out.println(q.front());
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

