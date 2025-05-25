import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int i = 0;
		int j = 0;
		int temp = 0;

		int[] arr = new int[n];
		for(int le = 0; le<n;le++) {
			arr[le] = le+1;
		}
		for(int idx = 0; idx<m;idx++) {
			
			i = sc.nextInt();
			j = sc.nextInt();
			 temp = arr[i-1];
	            arr[i-1] = arr[j-1];
	            arr[j-1] = temp;
		}

		
		for(int p = 0;p<arr.length;p++) {
			System.out.print(arr[p]+" ");
		}
		
	}
}
