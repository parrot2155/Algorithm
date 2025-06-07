import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase(); //입력받아 대문자로 
        
        int[] count = new int[26]; //알파벳 개수만큼 배열

        for (int i=0;i<str.length();i++) {
            int num = str.charAt(i)-65 ;
            count[num]++;	
        }
        
        int max = 0;
        char ans = '?';
        for (int i = 0; i < count.length; i++) {
            if(max < count[i]){
                max = count[i];
                ans = (char)(i+65);
            }else if(max == count[i]){
                ans = '?';
            }
        }
        System.out.println(ans);
	}
}