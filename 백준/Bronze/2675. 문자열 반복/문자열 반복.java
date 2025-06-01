import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] narr = new int[t];
		String[] strarr = new String[t];
		
		for(int i = 0; i < t; i++) {
			narr[i] = sc.nextInt();
			strarr[i] = sc.next();
		}
		for(int j=0;j<t;j++) { //t번 반복
				for(int l=0;l<strarr[j].length();l++) {
					for(int k=0;k<narr[j];k++) { //글자를 n번씩 출력
					System.out.print(strarr[j].charAt(l));
				}
			}			
			System.out.println();
		}
	}
}