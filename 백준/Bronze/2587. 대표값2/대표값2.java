import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		arr[0] =sc.nextInt();
		arr[1] =sc.nextInt();
		arr[2] =sc.nextInt();
		arr[3] =sc.nextInt();
		arr[4] =sc.nextInt();
		
		int sum = 0;
		for(int i=0;i<5;i++) {
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		System.out.println(sum/5);
		System.out.println(arr[2]);
	}
}