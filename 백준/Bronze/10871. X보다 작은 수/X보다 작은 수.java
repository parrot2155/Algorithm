import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int leng = sc.nextInt();
		int num = sc.nextInt();
		int[] nArr = new int[leng];
		
		for(int i=0;i<leng;i++) {
			nArr[i]=sc.nextInt();
		}
		
		for(int j=0;j<leng;j++) {
			if(nArr[j]<num) {
				System.out.print(nArr[j]+" ");
			}
		
		}
	}

}