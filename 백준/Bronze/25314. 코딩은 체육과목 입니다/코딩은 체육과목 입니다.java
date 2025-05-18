import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solution();
	}
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String pnt = "";
		
		for(int i = 0;i<(num/4);i++) {
			pnt += "long ";
		}
		if(num%4!=0) {
			pnt += "long ";
		}
		
		System.out.println(pnt+"int");
	}
}