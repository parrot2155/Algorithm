import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int[] num = new int[time];
		for(int i=0;i<time;i++) {
			num[i] = sc.nextInt();
		}
		int search = sc.nextInt();
		int count = 0;
		for(int j = 0;j<time;j++) {
			if(num[j]==search) {
				count++;
			}
		}
		System.out.println(count);
	}

}