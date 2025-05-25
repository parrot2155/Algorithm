import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] a = new String[5][15];
        
        for(int i=0;i<5;i++) {
        	String[] str = sc.next().split("");
        	
        	for(int j=0;j<str.length;j++) {
        		a[i][j]= str[j];
        	}
        }
        for(int i=0;i<15;i++) {
        	for(int j=0;j<5;j++) {
        		if(a[j][i] !=null ) {
        			System.out.print(a[j][i]);
        		
        		}
    			
        	}
        }
	}
}