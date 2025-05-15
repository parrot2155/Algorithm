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
		 int res = no1;
		 
		 if(no1<no2) {
			 System.out.println("<");
		 }else if(no1==no2) {
			 System.out.println("==");
		 }else {
			 System.out.println(">");
		 }
	}
}