import java.util.Arrays;
class Solution {
    //h인덱스
    //1. 내림차순 정렬한다.
    //2. 숫자와 해당 숫자의 인덱스를 비교한다.
    //3. 인덱스보다 숫자가 더 적어지면 반복 중단.
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);//일단 오름차순 정렬
        
        for(int i=citations.length-1;i>=0;i--){//내림차순처럼 뒤에서부터 읽기
            
            if(citations[i]>=citations.length-i){//현재 논문의 인용 수와 인덱스(현재까지 논문수)비교
                
                answer = citations.length-i;
                
            }else{  //현재 논문의 인용 수가 논문 수보다 작아지면 반복문 중단
                break;
            }
        }
        return answer;
    }
}