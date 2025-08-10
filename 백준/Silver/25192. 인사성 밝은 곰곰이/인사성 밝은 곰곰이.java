import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Set<String> gomgom = new HashSet<>();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();

            if (input.equals("ENTER")) {
                gomgom.clear();
            } else {
                if (!gomgom.contains(input)) {
                    gomgom.add(input);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
