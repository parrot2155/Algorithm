
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no = sc.nextInt();
		int line = 1;
		int res = 0;
		int div =1;
		
		while(no>div) {
			line++;
			div+=line;
		}
		if(line%2==0) {
			System.out.println((line-(div-no))+"/"+(1+(div - no)));
		}
		else {
			System.out.println((1+(div - no))+"/"+(line-(div-no)));
		}
		
		
	}

}
