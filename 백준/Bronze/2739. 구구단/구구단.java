import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solution();
	}
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int no1 = sc.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.println(no1+" * "+i+" = "+(no1*i));
		}
	}
}