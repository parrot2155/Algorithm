import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solution();
	}
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int n = sc.nextInt();
		int price = 0;
		int sum = 0;

        for (int i = 0; i < n; i++){
        	price = sc.nextInt();
            sum += price * sc.nextInt();
		}
        if(total==sum) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
	}
}