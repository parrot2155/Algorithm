import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int div = 1;
		int cnt = 1;
		
		while(((n-1)/div)>0) {
			div+=(cnt*6);
			cnt++;
		}
		
		
		System.out.println(cnt);
	}

}