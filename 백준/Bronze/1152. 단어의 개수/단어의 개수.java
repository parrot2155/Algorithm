import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().trim();//줄로 읽어와서 앞뒤 띄어쓰기 없애고	
	
		if(str.equals("")) {
			System.out.println(0);
		}else {
			System.out.println(str.split(" ").length);
		}
		
	}
}