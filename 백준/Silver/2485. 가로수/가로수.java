import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        
        // 인접한 가로수 간의 간격
        long[] diff = new long[n - 1];
        for (int i = 0; i < n - 1; i++) {
            diff[i] = arr[i + 1] - arr[i];
        }
        
        // 간격들의 최소값
        long minGap = diff[0];
        for (int i = 1; i < n - 1; i++) {
            if (diff[i] < minGap) {
                minGap = diff[i];
            }
        }
        
        // 최대 공약수 찾기
        long div = 0;
        for (long i = minGap; i >= 1; i--) { // 역순으로 탐색해 최대값 찾기
            boolean isDivisor = true;
            for (long gap : diff) {
                if (gap % i != 0) { // i가 모든 간격의 공약수가 아니면
                    isDivisor = false;
                    break;
                }
            }
            if (isDivisor) {
                div = i;
                break;
            }
        }
        
        // 필요한 나무 개수 계산
        long totalTrees = 0;
        for (long gap : diff) {
            totalTrees += (gap / div) - 1; // 각 간격에 필요한 추가 나무
        }
        
        System.out.println(totalTrees);
    }
}