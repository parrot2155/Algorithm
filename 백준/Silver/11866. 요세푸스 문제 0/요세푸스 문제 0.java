import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue q = new Queue(n);

        for (int i = 1; i <= n; i++) {
            q.enqueue(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (q.size() > 0) {

            for (int i = 0; i < k - 1; i++) {	//k앞에 애들은 뒤로 넣는다.
                q.enqueue(q.dequeue());
            }
            sb.append(q.dequeue());				//k번째는 제거
            if (q.size() > 0) {
                sb.append(", ");
            }
        }

        sb.append(">");
        System.out.println(sb);
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
		if (rear == capacity)
			rear = 0;
		return no;
	}

	public int dequeue() {
		if (num <= 0)
			return -1;
		int val = q[front++];
		num--;
		if (front == capacity)
			front = 0;
		return val;
	}

	public int front() {
		if (num <= 0)
			return -1;
		return q[front];
	}

	public int back() {
		if (num <= 0)
			return -1;
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
