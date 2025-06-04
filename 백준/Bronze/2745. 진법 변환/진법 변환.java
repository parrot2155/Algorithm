import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(str.length()-1-i);
			if(ch>='A'&&ch<='z') {
				sum += (ch-55)*Math.pow(n, i);
			}else if(ch>='0'&&ch<='9') {
				sum += (((int)ch)-48)*Math.pow(n, i);
			}
			
		}
		System.out.println(sum);
	}
}
