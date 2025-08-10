import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}

		Arrays.sort(a);

		// 산술평균
		int mean = (int) Math.round((double) sum / n);

		// 중앙값
		int median = a[n / 2];

		// 최빈값 : 가장 긴 연속 길이를 구하고, 그 길이를 가진 값들 중 두 번째로 작은 값
		int best = 1; 
		int cnt = 1;
		for (int i = 1; i < n; i++) {
			if (a[i] == a[i - 1]) {
				cnt++; // 이전값과 같으면 ++
			} else {
				best = Math.max(best, cnt); // 아니면 최빈값 중 제일 긴 값 best에 저장
				cnt = 1; // 새로 카운트
			}
		}
		best = Math.max(best, cnt); // 마지막값까지 훑어보고 최빈값의 빈도 구하기

		ArrayList<Integer> modes = new ArrayList<>();
		cnt = 1;
		for (int i = 1; i < n; i++) {
			if (a[i] == a[i - 1]) {
				cnt++; // 이전값과 같으면 ++
			} else {
				if (cnt == best) {	
					modes.add(a[i - 1]); // 최빈값 후보 추가
				}
				cnt = 1; // 새로 카운트
			}
		}
		if (cnt == best) {
			modes.add(a[n - 1]); // 마지막 처리
		}

		int mode;
		if (modes.size() >= 2) {
			mode = modes.get(1); // 여러 개면 두 번째로 작은 값
		} else {
			mode = modes.get(0); // 하나면 그 값
		}

		// 범위
		int range = a[n - 1] - a[0];

		System.out.println(mean);
		System.out.println(median);
		System.out.println(mode);
		System.out.println(range);
	}
}
