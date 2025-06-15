import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		int min = 0;
		boolean isMin = false;
		
		for(int i = m; i <= n; i++) {
			if(i < 2) continue;  // 2 미만 잘라내기
			
			boolean isPrime = true;
			for(int di = 2; di < i; di++) {
				if(i % di == 0) {
					isPrime = false;
					break;  
				}
			}
			
			if(isPrime) {
				sum += i;
				if(!isMin) {
					min = i;
					isMin = true;
				}
			}
		}
		
		if(isMin) {
			System.out.println(sum);
			System.out.println(min);
		} else {
			System.out.println(-1);
		}
	}
}
