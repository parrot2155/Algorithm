import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solution();
	}
	public void solution() {
		Scanner sc = new Scanner(System.in);
		 int h = sc.nextInt();
		 int m = sc.nextInt();

		 int time = (h*60)+m-45;
		 
		 if(time>0) {
			 System.out.println((time/60)+" "+(time%60));
		 }else if(time<0) {
			 System.out.println(((1440+time)/60)+" "+((1440+time)%60));
		 }else if(time>1440) {
			 System.out.println(((time-1440)/60)+" "+((time-1440)%60));
		 }else {
			 System.out.println("0 0");
		 }
	}
}