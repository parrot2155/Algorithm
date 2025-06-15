import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		
		long res = (v - a) / (a -b);

		if ((v - a) % (a - b) == 0) {
			System.out.println(res + 1);
		} else {
			System.out.println(res + 2);
		}
				

		//실패한 첫트
		
//		int day = 0;
//		int ol = 0; //올라간 높이
//		
//		
//		while(ol<v) {
//			day++;
//			ol+=a;
//			if(ol>=v) {
//				break;
//			}
//			ol-=b;
//			
//			
//		}
//		System.out.println(day);
	}

}
