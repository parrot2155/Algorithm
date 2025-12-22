import java.util.*;

//트럭이 다리에 올라와서 다리길이만큼 이동 후 내려간다.
//다리위에는 무게제한이 있다.
//마지막 트럭이 모두 이동 후 내려가는 시점까지 시간을 계산한다.

//트럭이 다리에 올라온다 -> 1초
//앞으로 한칸 이동 -> 1초
//다 건너감 -> 1초

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int sum = 0;  // 현재 다리 위의 무게 합
        int time = 0; // 흐른 시간

        // 대기 중인 트럭을 하나씩 꺼내서
        for (int truck : truck_weights) {
            
            while (true) {
                // 먼저 다리가 꽉 차면 맨 앞 트럭 뺴기
                if (bridge.size() == bridge_length) {
                    sum -= bridge.poll();
                }

                // 무게 검증
                if (sum + truck <= weight) {//무게 괜찮으면
                    bridge.add(truck);  //트럭 다리에 올리기
                    sum += truck;       
                    time++;             
                    break;
                } 
                // 무거우면 0 넣기
                else {
                    bridge.add(0);
                    time++;
                }
            }
        }
        //마지막 트럭이 다리에 올라오고 끝남 -> 다리 길이만큼 시간 추가
        return time + bridge_length;
    }
}