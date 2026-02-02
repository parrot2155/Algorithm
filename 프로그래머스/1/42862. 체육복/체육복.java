import java.util.Arrays;
//1. 배열 하나 만들어서 체육복 몇 벌인쓴ㄴ지 확인할거임
//2. 일단 모두 1벌 있다 치고, 도난당하면 -1, 여벌 있으면 +1
//3. 체육복이 없는 학생은 앞뒤 학생 확인해서 여벌 있는지 확인
//4. 있으면 여벌-1, 없는학생+1
//5. 최종적으로 체육복이 1이상인 학생 수 카운트
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 모든 학생은 처음에 1벌씩 있다고 치고
        int[] students = new int[n + 1];//n+1개로 만들어서 바로 학생번호로 인덱스를 찾도록 만듦
        Arrays.fill(students, 1);
        
        // 도난당한 학생은 -1
        for (int l : lost) {
            students[l]--;
        }
        
        // 여벌 있는 학생은 +1
        for (int r : reserve) {
            students[r]++;
        }
        
        // 체육복 빌려주기 로직
        for (int i = 1; i <= n; i++) {
            
            if (students[i] == 0) { // 체육복이 없는 학생은
                
                // 앞번호 학생에게 빌릴 수 있는지?
                if (i - 1 >= 1 && students[i - 1] == 2) {
                    
                    students[i]++;
                    students[i - 1]--;
                } 
                
                // 뒷번호 학생에게 빌릴 수 있는지?
                else if (i + 1 <= n && students[i + 1] == 2) {
                    
                    students[i]++;
                    students[i + 1]--;
                }
            }
        }
        
        // 체육복 1벌 이상인 학생 계산
        
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if (students[i] >= 1) {
                answer++;
            }
        }
        
        return answer;
    }
}