import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            int count = 0;
            boolean isVPS = true;
            
            // (일때 ++, )일때 -- 해서 최종 0이면 yes 아니면 no
            // (보다 )가 많아지면 no
            
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '(') {
                    count++;
                } else { //  ) 일때
                    count--;
                }

                if (count < 0) {
                    isVPS = false;
                    break;
                }
            }

            
            if (isVPS && count == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}