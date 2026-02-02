import java.util.Stack;
//1. 숫자를 하나씩 확인하며
//2. 앞에서 부터 읽으며 뒷 숫자보다 작으면 삭제. 
//3. k가 0이 되거나 삭제할 숫자가 남아 있지 않으면 멈춤

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        
        //숫자를 하나씩 확인
        for (int i = 0; i < number.length(); i++) {
            
            // answer에 값이 남아있고, k가 남았으며, 앞 숫자가 현재 숫자보다 작다면
            while (answer.length() > 0 && k > 0 && answer.charAt(answer.length() - 1) < number.charAt(i)) {
                
                answer.deleteCharAt(answer.length() - 1);//마지막 숫자 제거
                
                k--;
            }
            
            answer.append(number.charAt(i));//현재 숫자를 answer에 추가
        }
        
        // 숫자가 내림차순이라 k가 남았으면 뒤에서부터 k만큼 잘라냄
        return answer.substring(0, answer.length() - k);
    }
}