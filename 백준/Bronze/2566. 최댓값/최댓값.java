import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[9][9];
        
        for(int i=0;i<9;i++) {
        	for(int j=0;j<9;j++) {
        		a[i][j]= sc.nextInt();
        	}
        }
        int max = a[0][0];
        int maxx = 0;
        int maxy = 0;
        for(int i=0;i<9;i++) {
        	for(int j=0;j<9;j++) {
        		if(max<a[i][j]) {
        			max = a[i][j];
        			maxx = i;
        			maxy = j;
        		}
        	}
        }

		System.out.println(max);
		System.out.println((maxx+1)+" "+(maxy+1));
		
	}
}