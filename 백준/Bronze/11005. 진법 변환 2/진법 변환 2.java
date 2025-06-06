import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //n입력
		int b = sc.nextInt(); //b입력
		String sum = ""; 	//최종 출력될 문자열 선언
		
		while(n>0) { 	//n이 0.xxx일때도 나머지 계산 필요
			if(n%b<10) {	//나머지가 10이하일 경우 숫자 그대로 넣기
				sum = (char)(n%b + '0')+sum; //나머지가 없을경우 0부터 9까지
			}else if(n%b>=10){ 	//나머지가 10이상일경우 문자로 넣기
				sum = (char)(n%b-10 + 'A')+sum;	//아스키코드 A부터 넣기
			}
			
			n = n/b; //n을 b로 계속 나눠서 계산
		}
		System.out.println(sum);
	}

}