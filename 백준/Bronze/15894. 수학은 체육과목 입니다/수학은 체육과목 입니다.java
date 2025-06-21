import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextInt();
		
		long res = n+(n*2)+n; //윗면 + 옆면 + 아랫면
		
		System.out.println(res);
	}
}