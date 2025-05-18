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
		int no3 = sc.nextInt();
		int total = 0;
		
		if(no1==no2||no2==no3||no3==no1) {
			if(no1==no2&&no2==no3) {
				total = 10000+(no1*1000);
			}else if(no1==no2){
				total = 1000+(no1*100);
			}else if(no2==no3){
				total = 1000+(no2*100);
			}else if(no3==no1){
				total = 1000+(no3*100);
			}
		}else {
			total = Math.max(no1, Math.max(no2, no3))*100;
		}
		System.out.println(total);
	}
}