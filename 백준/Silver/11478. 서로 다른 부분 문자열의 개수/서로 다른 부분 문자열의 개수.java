import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Set<String> subs = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                subs.add(s.substring(i, j));			//모든 연결된 조합을 set에 저장.
            }											//set은 중복을 없애줌.
        }

        System.out.println(subs.size());
    }
}