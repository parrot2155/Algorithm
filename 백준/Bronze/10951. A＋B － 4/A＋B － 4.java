import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solution();
	}
	public void solution() {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int no1 = sc.nextInt();
			int no2 = sc.nextInt();
			System.out.println(no1+no2);
		}
	}
}