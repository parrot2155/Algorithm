import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
     
        int[] answer = new int[commands.length];//결과 담을 배열 만들기

        for(int i = 0; i < commands.length; i++) {  //commands배열에서 하나씩 꺼내서 처리할것임
            int[] result = new int[commands[i][1] - commands[i][0] + 1];//array에서 값 꺼내서 처리할 배열
            for(int j = 0; j < result.length; j++) {    //array에서 commadns[i][0](시작값)부터 넣기.
                result[j] = array[commands[i][0] - 1 + j];//시작 번호가 1부터 시작이라 -1을 해줘야함
            }

            Arrays.sort(result);    //오름차순 정렬

            answer[i] = result[commands[i][2] - 1];//결과를 저장
        }
        
        return answer;
    }
}