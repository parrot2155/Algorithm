import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int top = h-y;
		int bottom = y;
		int left = x;
		int right = w-x;
		
		System.out.println(Math.min(right, Math.min(top, Math.min(bottom, left))));
	}
}