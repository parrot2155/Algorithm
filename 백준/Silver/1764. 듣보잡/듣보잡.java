import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> noHear = new HashSet<String>();
        for(int i=0; i<N; i++) {
            noHear.add(br.readLine());
        }

        int count = 0;
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<String>();
        for(int i=0; i<M; i++) {
            // 찾고자 하는 값을 입력받는다
            String temp = br.readLine();
            // 찾고자 하는 값이 HashSet안에 있다면 list에 넣어준다
            if(noHear.contains(temp)) {
                list.add(temp);
                count++;
            }
        }
        br.close();

        // list 정렬
        Collections.sort(list);
        for(String val : list) {
            sb.append(val).append("\n");
        }

        System.out.println(count);
        System.out.println(sb);
    }
}