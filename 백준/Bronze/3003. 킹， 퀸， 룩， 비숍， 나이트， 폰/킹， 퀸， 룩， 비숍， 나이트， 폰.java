import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] in = new int[6];
		int[] or = {1,1,2,2,2,8};
		int[] res = new int[6];
		
		for(int i=0; i<6;i++) {
			in[i] = sc.nextInt();
			res[i] = or[i] - in[i];
		}
		
		for(int j=0;j<6;j++) {
			System.out.print(res[j]+" ");
		}
		
	}

}