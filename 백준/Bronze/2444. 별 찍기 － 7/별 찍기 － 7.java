import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) { //n줄 출력
			for(int j=0;j<n-i-1;j++) {//공백
				System.out.print(" ");
			}
			for(int j=0;j<((2*i)+1);j++) {//*
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<n-1;i++) { //n-1줄 출력
			for(int j=0;j<i+1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n*2-3-(2*i);j++) {
				System.out.print("*");
			}

			System.out.println();
		}		
	}
}