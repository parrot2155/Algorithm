import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    // 사전순 비교: true면 s1이 더 뒤에 있어야 한다
    public static boolean isBigger(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) < s2.charAt(i)) return false;
            else if (s1.charAt(i) > s2.charAt(i)) return true;
        }
        return s1.length() > s2.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextLine());
        }

        List<String> list = new ArrayList<>(set);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    return s1.length() - s2.length();
                } else {
                    int minLength = Math.min(s1.length(), s2.length());
                    for (int i = 0; i < minLength; i++) {
                        if (s1.charAt(i) != s2.charAt(i)) {
                            return s1.charAt(i) - s2.charAt(i);
                        }
                    }
                    return 0;
                }
            }
        });
        for (String s : list) {
            System.out.println(s);
        }
    }
}
