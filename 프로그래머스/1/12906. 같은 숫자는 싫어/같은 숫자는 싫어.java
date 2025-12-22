import java.util.*;
//1. 결과를 담을 바구니 준비 (ArrayList)

// 2. 앞사람(i)과 뒷사람(i+1)을 비교해서, 다르면 앞사람을 바구니에 넣는다

// 3. 비교할 뒷사람이 없는 맨 마지막 숫자도 넣는다.
public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                result.add(arr[i]);
            }
        }
        result.add(arr[arr.length - 1]);//마지막 원소 추가
        
        int[] answer = new int[result.size()];  //리턴하기 위한 배열로 다시 담아주기
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        
        return answer;
        
    }
}