import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int cut =sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
        for (int i=0; i<arr.length-1;i++) {		// 내림차순 정렬
            for(int j=i+1; j<arr.length;j++) {
                if(arr[i]<arr[j]) { 
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
		System.out.println(arr[cut-1]);
	}
}