import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] mny = new int[n];
		
		for(int i=0;i<n;i++) {
			mny[i] = sc.nextInt(); 
		}
		
		for(int j=0;j<n;j++) {
			System.out.println((mny[j]/25)+" "+(mny[j]%25)/10+" "+((mny[j]%25)%10)/5+" "+((mny[j]%25)%10)%5);
		}
	}
}