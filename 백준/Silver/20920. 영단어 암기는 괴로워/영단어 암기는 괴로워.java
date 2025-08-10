import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 단어 개수
        int m = Integer.parseInt(st.nextToken()); // 외울 최소 길이

        Map<String, Integer> countMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (word.length() >= m) {
                countMap.put(word, countMap.getOrDefault(word, 0) + 1);
            }
        }

        List<String> words = new ArrayList<>(countMap.keySet());

        Collections.sort(words, new Comparator<String>() {
            public int compare(String a, String b) {
                if (!countMap.get(a).equals(countMap.get(b))) {
                    return countMap.get(b) - countMap.get(a);
                }
                if (a.length() != b.length()) {
                    return b.length() - a.length();
                }
                return a.compareTo(b);
            }
        });

        for (String w : words) {
            sb.append(w).append("\n");
        }

        System.out.print(sb);
    }
}
