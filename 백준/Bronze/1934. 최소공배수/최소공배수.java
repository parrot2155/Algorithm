import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int an = 1;
			int bn = 1;
			

			while ((a * an) != (b * bn)) {
				if ((a * an) < (b * bn)) {
					an++;
				} else if ((a * an) > (b * bn)) {
					bn++;
				}
			}
			res[i] = (a * an);
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(res[i]);
		}

	}
}