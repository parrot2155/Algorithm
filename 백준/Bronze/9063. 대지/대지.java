import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int maxx = -10000;
		int maxy = -10000;
		int minx = 10000;
		int miny = 10000;
		
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x>maxx) {
				maxx = x;
			}
			if(y>maxy) {
				maxy = y;
			}
			if(minx>x) {
				minx=x;
			}
			if(miny>y) {
				miny=y;
			}
		}
		System.out.println((maxx-minx)*(maxy-miny));
	}
}