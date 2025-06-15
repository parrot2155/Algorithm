import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int di = 2;
		
		
		if(n>1) {
			while(di<=n) {
				if(n%di==0) {
					n=n/di;
				System.out.println(di);
				}else {
					di++;
				}
			}
		}

	}
}