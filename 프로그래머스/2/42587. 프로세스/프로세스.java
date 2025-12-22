import java.util.*;

// PriorityQueue 란?
// 일반적인 큐는 먼저 들어간 데이터가 먼저 나가는 구조인 FIFO 형식의 자료구조입니다. 반면에 우선순위 큐의 경우 들어가는 순서와는 상관없이 우선순위가 높은 데이터가 먼저 나가는 자료구조입니다. 우선순위 큐의 경우 힙 자료구조를 통해서 구현될 수 있습니다. ( 또한 다른 자료구조를 통해서 구현될 수 있음 )


class Solution {
    public int solution(int[] priorities, int location) {
        // 1. 우선순위 큐에 중요도를 넣음 (내림차순)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int p : priorities) {
            pq.add(p);
        }

        int answer = 0; // 몇 번째 실행인지

        // 2. 큐가 빌 때까지
        while (!pq.isEmpty()) {
            
            // 3. 배열을 처음부터 끝까지 반복
            for (int i = 0; i < priorities.length; i++) {
                
                // 현재 배열의 값과 우선순위 큐의 최댓값이 같다면
                if (priorities[i] == pq.peek()) {
                    
                    // 실행 순서가 되면
                    pq.poll(); // 우선순위 큐에서 제거
                    answer++;  // 실행 횟수 증가

                    // 찾던 위치라면 정답 리턴
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }
        
        return answer;
    }
}