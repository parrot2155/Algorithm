
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no = sc.nextInt();
		int line = 1;		//현재 줄(=현재 줄의 들어있는 숫자 개수)
		int div =1;  		//나누는 수(=각 라인의 마지막 제일 큰 수)
		
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
