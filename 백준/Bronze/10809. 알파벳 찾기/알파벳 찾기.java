import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int[] abc = new int[26];
		
		for(int i=0;i<26;i++) {
			abc[i]= -1;
		}
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(abc[ch-97] == -1) {
				abc[ch-97] = i;
			}
		}
		
		for(int i=0;i<26;i++) {
			System.out.print(abc[i]+" ");
		}
		
	}
		
}