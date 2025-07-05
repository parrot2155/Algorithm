
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = n;
        int res = 0;
        
        while(m>0) {
        	int cal = m+m/1000000+(m%1000000)/100000+(m%100000)/10000+(m%10000)/1000+(m%1000)/100+(m%100)/10+m%10;
        	if(cal==n) {
        		res=m;
        	}
        	m--;
        }
        System.out.println(res);
    }
}

//n+n/1000000+n/100000+n/10000+n/1000=n/100+n/10+n%10