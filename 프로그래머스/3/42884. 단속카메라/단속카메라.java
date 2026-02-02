import java.util.*;
//1. 진출로를 기준으로 정렬
//2. 첫차량 진출로에 우선 카메라 설치
//2. 그 후 차량을 하나씩 반복하며 진입이 앞차 진출로보다 뒤에 있으면 카운트++하고 새로 카메라를 지금 자동차 진출로로 옮김
//3. 끝까지 반복
class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        
        // 1. 진출 지점 기준으로 오름차순
        // 가장 먼저 고속도로를 빠져나가는 차부터 확인할거임
        Arrays.sort(routes, (a,b) -> {
            return a[1] - b[1];
        });

        // 2. 첫 번째 카메라를 가장 먼저 나가는 차의 진출 지점에 설치
        int cam = routes[0][1]; 
        answer++; // 카메라 대수 1대 추가
        
        // 3. 모든 차량의 경로를 하나씩 확인합니다.
        for(int[] route : routes){
            // 4. 현재 설치된 카메라 위치(max)보다 
            // 새로운 차량의 진입 지점(route[0])이 더 뒤에 있다면?
            if(cam < route[0]) {
                // 기존 카메라로는 이 차량을 단속 못함
                // 이 차량이 나가는 지점에 새로운 카메라를 설치
                cam = route[1];
                answer++; // 카메라 대수 추가
            }
        }

        return answer;
    }
}