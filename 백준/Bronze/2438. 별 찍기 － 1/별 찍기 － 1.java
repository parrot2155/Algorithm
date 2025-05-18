import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solution();
	}
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		String str = "";
		
		for(int i=0;i<no;i++) {
			str += "*";
			System.out.println(str);
		}
	}
}