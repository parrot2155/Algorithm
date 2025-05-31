import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		String[] n = sc.next().split("");
		int sum = 0;
		
		for(int i=0;i<t;i++){
			sum += Integer.parseInt(n[i]);
		}
		System.out.println(sum);
	}
		
}