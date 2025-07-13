import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
 
 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] o = new int[n];	//origin
		int[] s = new int[n];	//sorted	새로 정렬할 배열
		HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();	//정렬한 배열로 순위 매기는 맵
 
		
		for(int i = 0; i < n; i++) {
			s[i] = o[i] = sc.nextInt();
		}
		Arrays.sort(s);			

		int rank = 0;	//정렬된 뱌열을 map에 넣는다
		for(int v : s) {
			if(!rankMap.containsKey(v)) {
				rankMap.put(v, rank);
				rank++;					//중복되지 않으면 순위 ++
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int key : o) {
			int ranking = rankMap.get(key);	//순위 만들어놓은 맵에서 키값을 가지고 o배열 자리에 순위값을 넣는다.
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);
		
		
 
	}
}