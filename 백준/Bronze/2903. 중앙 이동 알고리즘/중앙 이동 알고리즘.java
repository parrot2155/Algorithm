import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int li = 2;      	//첫째항 2
		
		for(int i=0;i<n;i++) {
			li = (li+(li-1));  //현재항 = 이전항+(이전항-1)
		}
		System.out.println((int)Math.pow(li, 2));	//제곱해서 출력
	}
}
// 2 2
// 3 3
// 5 5 
// 9 9
// 17 17
