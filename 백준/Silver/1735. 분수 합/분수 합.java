import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int den1 = sc.nextInt();
		
		int num2 = sc.nextInt();
		int den2 = sc.nextInt();
		
		int resDen = den1*den2;
		int resNum = (num1*den2)+(num2*den1);
		
		for(int i=Math.max(resNum, resDen);i>1;i--) {
			if(resNum%i==0&&resDen%i==0) {
				resNum = resNum/i;
				resDen = resDen/i;
			}
		}
		System.out.println(resNum+" "+resDen);
		
	}
}