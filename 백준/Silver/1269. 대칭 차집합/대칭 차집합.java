import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int ACounts = Integer.parseInt(stringTokenizer.nextToken());
		int BCounts = Integer.parseInt(stringTokenizer.nextToken());

		HashMap<Integer, Integer> ele = new HashMap<>();

		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		for (int i = 0; i < ACounts; i++) {
			int numberA = Integer.parseInt(stringTokenizer.nextToken());
			ele.put(numberA, 1);
		}

		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		for (int i = 0; i < BCounts; i++) {
			int numberB = Integer.parseInt(stringTokenizer.nextToken());
			ele.put(numberB, ele.getOrDefault(numberB, 0) + 1);
		}	//있던 숫자면 2, 없던 숫자면 1.

		System.out.println(ele.values().stream().filter(number -> number == 1).count());
	}	//1인 것만 필터링
}