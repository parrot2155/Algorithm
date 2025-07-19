import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long res = 0;
		long a = sc.nextLong();
		long b = sc.nextLong();
		long an = 1;
		long bn = 1;

		while ((a * an) != (b * bn)) {
			if ((a * an) < (b * bn)) {
				an++;
			} else if ((a * an) > (b * bn)) {
				bn++;
			}
		}
		res = (a * an);
		System.out.println(res);
	}
}