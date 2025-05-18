import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solution();
	}
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();

		while(no1!=0||no2!=0) {
			System.out.println(no1+no2);
			no1 = sc.nextInt();
			no2 = sc.nextInt();
		}
	
	}
}