//문제 이해가 어렵네요...

//현재 시점에 매수를 했을 때
//앞으로 손실이 나지 않을 시간은 몇 초인가?


class Solution {
    public int[] solution(int[] prices) {
        
        int[] answer = new int[prices.length];

        // 1. 모든 주식 가격에 대해
        for (int i = 0; i < prices.length; i++) {
            
            // 2. 기준금액 다음부터 끝까지 비교
            for (int j = i + 1; j < prices.length; j++) {
                
                // 일단 시간 1초 카운트
                answer[i]++; 

                // 가격이 떨어지면
                if (prices[i] > prices[j]) {
                    break; // 반복 종료
                }
            }
        }
        
        return answer;
    }
}