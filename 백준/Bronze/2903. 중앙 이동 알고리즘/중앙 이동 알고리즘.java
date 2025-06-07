import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sq = 2;
		
		for(int i=0;i<n;i++) {
			sq = (sq+(sq-1));
		}
		System.out.println((int)Math.pow(sq, 2));
	}
}
// 2 2
// 3 3
// 5 5 
// 9 9
// 17 17