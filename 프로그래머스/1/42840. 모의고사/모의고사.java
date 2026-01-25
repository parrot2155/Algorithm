import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        
        // 1. 찍기 순서를 배열로 만듦
        int[] su1 = {1, 2, 3, 4, 5};
        int[] su2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] su3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 2. 각 수포자의 점수
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        
        // 3. 정답 채점
        for(int i = 0; i < answers.length; i++) {
        
            if(answers[i] == su1[i % su1.length]) { 
                score1++;
            }
            if(answers[i] == su2[i % su2.length]) {
                score2++;
            }
            if(answers[i] == su3[i % su3.length]) {
                score3++;
            }
        }
        
        // 4. 가장 높은 점수 구하기
        int maxScore = Math.max(score1, Math.max(score2, score3));
        
        // 5. 가장 높은 점수를 받은 사람을 리스트에 담기 (여럿인 경우 고려
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == score1) list.add(1);
        if(maxScore == score2) list.add(2);
        if(maxScore == score3) list.add(3);
        
        // 6. ArrayList를 int[] 배열로 바궈서 리턴
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}