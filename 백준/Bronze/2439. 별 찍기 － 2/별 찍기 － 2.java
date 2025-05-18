import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solution();
	}
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=0;j<num-i;j++) {
				System.out.print(" ");
			}
			for(int j=num-i;j<num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}