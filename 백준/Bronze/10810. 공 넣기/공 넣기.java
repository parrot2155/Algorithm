import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int i = 0;
		int j = 0;
		int k = 0;
		int[] arr = new int[n];
		
		for(int l=0;l<m;l++) {
			 i = sc.nextInt();
			 j = sc.nextInt();
			 k = sc.nextInt();
			 
			 for(int o = i-1; o<j;o++) {
				arr[o] = k;}
		}
		
		
		for(int p = 0;p<arr.length;p++) {
			System.out.print(arr[p]+" ");
		}
		
	}
}