import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        // 1. 요청 시점 기준으로 오름차순 정렬
        // - 먼저 요청된 작업부터 차례대로 검토
        Arrays.sort(jobs, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0]; 
            }
        });

        // 2. 처리 시간이 짧은 작업을 우선적으로 꺼내는 우선순위큐
        // - SJF(Shortest Job First) 알고리즘
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[1] - b[1]; 
            }
        });

        int currentTime = 0;   // 현재 시각
        int totalTime = 0;     // 모든 작업의 반환 시간(요청~종료) 총합
        int idx = 0;           // jobs 배열에서 다음에 들어올 작업의 인덱스
        int count = 0;         // 완료된 작업의 개수

        // 3. 모든 작업을 완료할 때까지
        while (count < jobs.length) {

            // (1) 현재 시간까지 모든 작업을 pq에 추가
            while (idx < jobs.length && jobs[idx][0] <= currentTime) {//작업이 남아있고, 현재 시간보다 같거나 앞서 요청된 작업이 있으면
                pq.add(jobs[idx]);//우선순위큐에 넣는다.
                idx = idx + 1;//인덱스+1
            }

            // (2) 대기열 상태에 따라 처리를 다르게 해준다.
            if (pq.isEmpty()) {
                // (2-1) 현재 일이 없다면, 다음 작업의 요청 시간으로
                currentTime = jobs[idx][0];
            } else {
                // (2-2) 대기열에서 가장 짧은 작업부터
                int[] job = pq.poll();
                
                // 현재 시간을 작업 소요 시간만큼 진행 -> 작업을 진행한다.
                currentTime = currentTime + job[1];
                
                // 전체시간 = 원래 전체 시간 + (작업 완료 시점 - 작업 요청 시점)
                totalTime = totalTime + (currentTime - job[0]);
                //작업+1
                count = count + 1;
            }
        }

        // 4. 전체 소요 시간 합계를 작업 개수로 나눈 평균값
        return totalTime / jobs.length;
    }
}