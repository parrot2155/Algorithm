import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solution();
	}
	public void solution() {
		Scanner sc = new Scanner(System.in);
		 int x = sc.nextInt();
		 int y = sc.nextInt();

		 if(x>0) {
			 if(y>0) {
				 System.out.println("1");
			 }else if(y<0) {
				 System.out.println("4");
			 }
		 }else if(y>0) {
			 System.out.println("2");
		 }else {
			 System.out.println("3");
		 }		 
	}
}