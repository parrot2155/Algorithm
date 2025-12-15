import java.util.Arrays;

// (A종류 개수+1)*(B종류 개수+1)*...-1
// 선택하지 않는 경우를 생각해서 +1을 한다.
// 마지막에 모두 선택하지 않는 경우의 수 1개는 빼준다.

class Solution {
    public int solution(String[][] clothes) {
        // 의상의 종류(인덱스 1)를 기준으로 정렬
        // 같은 종류끼리 붙어있게 만듦
        Arrays.sort(clothes, (o1, o2) -> o1[1].compareTo(o2[1]));//두번째 문자열 기준 오름차순

        int answer = 1;
        int count = 1; // 현재 종류의 의상 개수 (최소 1개부터 시작)

        // 배열을 순회하며 개수 세기
        for (int i = 0; i < clothes.length - 1; i++) {
            // 현재 의상 종류와 다음 의상 종류가 같다면
            if (clothes[i][1].equals(clothes[i + 1][1])) {
                count++;
            } else {
                // 종류가 달라지면, 지금까지 센 개수(count)를 식에 반영
                answer *= (count + 1);
                count = 1; // 카운트 초기화 (다음 종류의 첫 번째 옷)
            }
        }

        //반복문이 끝나면 마지막 그룹의 계산이 안 되어 있으므로 추가 계산
        answer *= (count + 1);

        //아무것도 안 입는 경우 1개 제외
        return answer - 1;
    }
}