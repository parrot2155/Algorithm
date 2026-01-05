import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public int[] solution(String[] operations) {
        //최댓값과 최솟값을 뽑아낼 우선순위 큐 두 개를 만든다.
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>();
        
        for (String operation: operations) {//명령을 하나씩 반복문 돌린다.
            
            String[] o = operation.split(" ");//중간에 공백 기준으로 값 분리해서 새로 담는다.(예. [D,-1])
            
            if (o[0].equals("I")) { //첫글자가 I이면
                
                int num = Integer.parseInt(o[1]);   //공백 뒤의 문자를 숫자로 변환하여
                min.add(num);//각각 큐에 넣는다.
                max.add(num);
                
            } else {//첫글자가 I가 아닌 경우 --> "D" 인 경우
                
                if (!min.isEmpty() && !max.isEmpty()) {//큐가 비어있는 경우는 제외한다.
                    
                    String num = o[1];  //공백 뒤의 글자를 판별하기 위해 변수에 담는다.(1인지,-1인지)
                    
                    if (num.equals("1")) { //1이면
                        
                        int maxNum = max.poll(); //최댓값을 뽑아낸다.
                        min.remove(maxNum); //뽑아낸 최댓값을 최솟값 구하는 큐에서 삭제한다.
                        
                    } else {    //첫글자가 I도 아니면서 뒷 글자가 1이 아닌 경우 --> "D -1"인 경우
                        
                        int minNum = min.poll();    //최솟값을 뽑아내고
                        max.remove(minNum);     //뽑아낸 최솟값을 최댇값 큐에서 삭제.
                    }
                }
            }
        }
        if (min.isEmpty() && max.isEmpty()) {   //두 큐가 다 비어있으면,
            
            return new int[]{0, 0}; //0,0출력
            
        }
        
        int[] answer = {max.peek(), min.peek()};    //아니면 {최댓값,최솟값} 출력
        
        return answer;
    }
}