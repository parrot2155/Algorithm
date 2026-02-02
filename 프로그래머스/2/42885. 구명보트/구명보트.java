import java.util.Arrays;
/*1. 가장 무거운 사람부터 차례대로 선택.
2. 배열을 탐색하며 더했을 때 무게제한에 걸리지 않으면서 가장 큰 사람이 있으면 추가.
3. 없으면 구조하고 카운트 +1  (최대2인 탑승 조건)
4. 이전 사람을 삭제하고 다음 사람부터 위 순서를 반복.
5. 최종적으로 카운트 수 리턴.
*/
/*class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        // 1. 몸무게 오름차순 정렬
        Arrays.sort(people);
        
        // 2. 구조 여부를 체크할 배열
        boolean[] rescued = new boolean[people.length];
        
        // 3. 가장 무거운 사람부터 선택 (뒤에서부터)
        for(int i = people.length - 1; i >= 0; i--) {
            
            // 이미 구조된 사람은 패스
            if (rescued[i]) {
                continue;
            }
            
            // 현재 무거운 사람 배에 태우기
            rescued[i] = true;
            
            // 4. 함께 탈 수 있는 사람 중 가장 무거운 사람 찾기
            for (int j = i - 1; j >= 0; j--) {
                
                // 아직 구조되지 않았고, 무게 제한을 넘지 않는다면
                if (!rescued[j] && people[i] + people[j] <= limit) {
                    rescued[j] = true; // 구조 처리
                    break; 
                }
            }
            
            // 5. 카운트 +1
            answer++;
        }
        
        return answer;
    }
}*/

import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        // 1. 오름차순 정렬
        Arrays.sort(people);
        
        // 2. 두 개의 포인터 설정
        int light = 0;               // 가장 가벼운 사람을 가리킴
        int heavy = people.length - 1; // 가장 무거운 사람을 가리킴
        
        // 3. 두 포인터가 만날 때까지 반복
        while (light <= heavy) {
            // 가장 무거운 사람 + 가장 가벼운 사람 합
            if (people[light] + people[heavy] <= limit) {
                // 두 명이 같이 탈 수 있다면 가벼운 사람도 다음으로 넘김
                light++;
            }
            
            // 무거운 사람은 같이 타든 혼자 타든 이번 보트에 무조건 탑승
            heavy--;
            
            // 보트 카운트 증가
            answer++;
        }
        
        return answer;
    }
}