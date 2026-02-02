import java.util.Arrays;

class Solution {
    public int solution(String name) {
        //1. 기본값은 커서 오른쪽으로 계속 이동.
        int move = name.length() - 1; 

        int alphabetCount = 0;
        
        // 2. 루프를 돌며 알파벳 변경 횟수와 좌우 이동 최솟값을 동시에 계산
        for (int i = 0; i < name.length(); i++) {
            
            // 상하 조작
            char c = name.charAt(i);
            // 'A'에서 위로 가기와 아래로 가기 중 작은 값 선택
            alphabetCount += Math.min(c - 'A', 'Z' - c + 1);
            
            // 좌우 조작 
            // 3. 내 다음 글자부터 연속된 'A'가 어디까지 이어지는지
            int next = i + 1;
            while (next < name.length() && name.charAt(next) == 'A') {
                next++;
            }
            
            // 4. 세 가지 경로 중 가장 짧은 것을 찾아서 move에 저장
            
            // 기존의 move 값
            // 앞으로 갔다가 뒤로 유턴하기 (i*2 현재까지 왔다가 다시 원점으로, name.length()-next 뒤에서부터 거꾸로)
            move = Math.min(move, i * 2 + (name.length() - next));
            
            // 뒤로 먼저 갔다가 다시 앞으로 유턴하기 (name.length()-next*2 뒤로 갔다가 다시 원점으로, i 앞으로)
            move = Math.min(move, (name.length() - next) * 2 + i);
        }
        
        // 5. 알파벳 바꾼 횟수와 커서 움직인 횟수를 합쳐서 리턴
        return alphabetCount + move;
    }
}