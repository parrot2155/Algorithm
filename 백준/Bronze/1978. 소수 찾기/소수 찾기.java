import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		int di = 2;
		boolean isPrime = true;
		
		
		for(int i=0;i<n;i++) {
			int no = sc.nextInt();
			if(no>1) {
					while(di<no) {
					if(no%di==0) {
						isPrime = false;
						di++;
					}else {
						di++;
					}
				}
				if(isPrime) {
					cnt++;
				}
				di = 2;
				isPrime = true;
			}
			
		}
		System.out.println(cnt);
	}
}