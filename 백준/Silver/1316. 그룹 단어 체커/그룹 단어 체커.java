import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i=0;i<n;i++) {
			StringBuffer str = new StringBuffer(sc.next());			//각 글자를 하나씩 읽어 현재 글자가 다음 글자랑 다르면 분리.
			for(int j=0;j<str.length();j++) {				//-> 붙어있는 같은 글자끼리 분리함.
				if(j<(str.length()-1)){
					if(str.charAt(j)!=str.charAt(j+1)) {
						str.insert(j+1," ");
						j++;
					}
				}
				
			}
			boolean chk = false;
			String[] ch = str.toString().split(" ");		//분리된 각 글자들 중 같은 글자가 있는지 비교
			for(int j=0;j<ch.length;j++) {				//있으면 카운트 안함.
				
				for(int k=(j+1);k<ch.length;k++) {
						if(ch[j].charAt(0)==ch[k].charAt(0)){
						chk = true;
						break;
					}
				}
			}
			if(chk != true) {
				cnt++;
			}	
		}
		System.out.println(cnt);
	}
}
