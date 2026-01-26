import java.util.*;

class Solution {
    
    // 현재 탐색 상태를 저장할 클래스
    static class State {
        String currentStr;   // 현재까지 만든 숫자 문자열
        boolean[] visited;   // 어떤 종이 조각을 썼는지 체크

        public State(String currentStr, boolean[] visited) {
            this.currentStr = currentStr;
            this.visited = visited;
        }
    }

    public int solution(String numbers) {
        HashSet<Integer> numberSet = new HashSet<>(); 
        //중복된 숫자를 자동으로 제거하기 위해 사용 ("011"과 "11"을 같은 11로 처리)
        int n = numbers.length(); // 문자열의 길이 (종이 조각의 총 개수)

        // 1. 스택 생성
        Stack<State> stack = new Stack<>();//앞으로 해야 할 작업
        
        // 초기 상태 삽입 (빈 문자열, 방문 없음)
        stack.push(new State("", new boolean[n]));

        // 2. 스택이 빌 때까지 반복
        while (!stack.isEmpty()) {
            State state = stack.pop(); //LIFO. 작업을 이어서 하겠다

            // 숫자가 만들어졌으면 Set에 추가 
            if (!state.currentStr.equals("")) { //""은 숫자가 아니니 무시.
                numberSet.add(Integer.parseInt(state.currentStr)); //문자열을 숫자로
            }

            // 남은 종이 조각들로 다음 상태를 만들어 스택에 넣음
            for (int i = 0; i < n; i++) {
                // 아직 사용하지 않은 종이 조각이라면
                if (!state.visited[i]) {
                    // 방문 기록을 복사해서 새 상태를 만듦
                    boolean[] nextVisited = state.visited.clone();
                    //클론해서 저장
                    //클론 안 하고 그냥 쓰면 A 경로에서 종이를 쓴 체크 표시가 B 경로에도 반영되버린다.
                    nextVisited[i] = true;//복사본에다가 종이를 썼다고 표시
                    
                    stack.push(new State(state.currentStr + numbers.charAt(i), nextVisited));
                    //새로 만든 숫자와 nextVisited를 묶어서 스택에 삽입
                }
            }
        }

        // 3. 소수 개수 세기
        int answer = 0;
        
        for (int num : numberSet) {
            if (isPrime(num)) {
                answer++;
            }
        }
        return answer;
    }

    // 소수 판별 
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for(int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}