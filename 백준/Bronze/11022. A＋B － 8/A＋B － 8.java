import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solution();
	}
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		for(int i=1;i<=no;i++) {
			int no1 = sc.nextInt();
			int no2 = sc.nextInt();
			System.out.println("Case #"+i+": "+no1+" + "+no2+" = "+(no1+no2));
		}
	}
}