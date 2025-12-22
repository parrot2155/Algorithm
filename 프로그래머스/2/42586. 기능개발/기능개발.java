import java.util.*;
// 1. 100퍼가 되는 남은 일수 계산
// 2/ 가장 앞에 있는 작업을 기준으로 그 뒤에있는 작업의 기간이 더 적으면 같이 배포
// 3. 앞에보다 더 많이 기간이 남았으면 새로 묶어서 배포
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        //(100-progresses)/speeds로 계산해서 큐에 담기
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i]; // 남은 작업
            int day = remain / speeds[i];     // 걸리는 일수
    
            //나누어 떨어지지 않으면 하루 더 ++
            if (remain % speeds[i] != 0) {
                day++;
            }
            q.add(day); // 큐에 넣기
        }
        
        ArrayList<Integer> result = new ArrayList<>();

        // 첫 번째 작업을 기준
        int frontDay = q.poll();
        int count = 1;

        // 큐가 빌 때까지
        while (!q.isEmpty()) {
            int day = q.poll(); // 다음 작업

            if (frontDay >= day) {
                // 일찍 끝나면 -> 함께 배포
                count++;
            } else {
                // 늦게 끝나면 -> 지금까지 모인 애들 배포
                result.add(count);

                // 새로운 선두 설정
                count = 1;
                frontDay = day;
            }
        }

        // 마지막 그룹 추가
        result.add(count);

        // 배열로 변환
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}