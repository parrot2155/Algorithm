import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<String>();
		for(int i=0;i<N;i++) {
			String[] arr = br.readLine().split(" ");
			if(arr[1].equals("enter")) {
				set.add(arr[0]);
			}
			else if(arr[1].equals("leave")){
				set.remove(arr[0]);
			}
		}
		
		ArrayList<String> list = new ArrayList<>(set);
		Collections.sort(list, Collections.reverseOrder());
		for(String s : list) {
			sb.append(s+"\n");
		}
		System.out.println(sb);
	}
}