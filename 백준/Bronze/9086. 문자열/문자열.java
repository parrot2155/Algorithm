import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();//<-이거 떄문에 시간 다잡아먹음;;***
		String[] res = new String[n];
		
		for(int i=0;i<n;i++) { 
			String[] str = sc.nextLine().split("");
			res[i] = str[0];
			res[i] += str[(str.length-1)];
			
		}
		
		for(int j=0;j<n;j++) {
			System.out.println(res[j]);
		}
	
	}
		
}