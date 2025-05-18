import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solution();
	}
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int hr = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();
		
		int finTime = ((hr*60)+min)+time;
		
		if(finTime>=1440) {
			finTime -= 1440; 
		}
		System.out.println((finTime/60)+" "+(finTime%60));
	}
}