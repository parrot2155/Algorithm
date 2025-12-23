import java.util.PriorityQueue;
//우선순위 큐를 사용해서 빠르게 가장 낮은 값을 계속 찾아준다.

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        // 낮은 숫자가 우선순위를 갖는 우선순위 큐
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 1. 스코빌 지수를 큐에 넣ㅡㄴ다
        for (int s : scoville) {
            pq.add(s);
        }

        // 2. 가장 낮은 스코빌 지수가 K보다 작은 경우
        while (pq.peek() < K) {
            // 예외 처리 - 남은 음식이 2개 미만인데도 K를 넘지 못하면 만들 수 없다
            if (pq.size() < 2) {
                return -1;
            }

            // 스코빌 지수 낮은 두 개 꺼내기
            int first = pq.poll();
            int second = pq.poll();

            // 스코빌 지수 계산
            int newScoville = first + (second * 2);
            
            // 계산된 음식을 다시 큐에 넣는다.
            pq.add(newScoville);
            
            // 섞은 횟수 증가
            answer++;
        }

        return answer;
    }
}