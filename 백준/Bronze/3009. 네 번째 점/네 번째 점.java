import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		int x;
		int y;
		
		if(x1 == x2) {		//x값 구하기
			x = x3;
		}
        else if(x1 == x3) {
        	x = x2;
        }
        else {
        	x = x1;
        }
        
        if(y1 == y2) {	//y값 구하기
        	y = y3;
        }
        else if(y1 == y3) {
        	y = y2;
        }
        else {
        	y = y1;
        }
        
        System.out.println(x + " " + y);
		
	}
}
