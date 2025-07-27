import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        //에라토스테네스 체	
		while(true) {
			int cnt = 0;
			int i,j=0;
			int n = sc.nextInt();
			if(n==0) {	//0인 경우 종료
				break;
			}
			boolean list[] = new boolean[2*n + 1];
			Arrays.fill(list,true);
			
			list[1] = false;	//1은 소수 아님
			
			for (i = 2; i <= n*2; i++)
				for (j = 2; i*j <= n*2; j++)
					list[i * j] = false;

			for (i = n+1; i <= n*2; i++) {
				if(list[i]==true) {
					cnt++;}
				}
			System.out.println(cnt);					
			}
	 }
}
