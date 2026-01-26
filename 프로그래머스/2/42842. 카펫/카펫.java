//1. 카펫의 넓이
//2. 가로 세로 최소 길이는 3
//3-1. 넓이/세로=가로 나누어 떨어지는지 판별
//3-2. 입력받은 개수와 맞는지 판별
//4. 아니면 다시 반복

class Solution {
    public int[] solution(int brown, int yellow) {
        // 1. 카펫의 전체 넓이 구하기
        int size = brown + yellow;

        // 2. 세로 길이를 3부터 늘려가며 찾기
        for (int height = 3; height <= size / height; height++) {
            
            // 3-1. 전체 넓이가 세로 길이로 나누어 떨어져야 함
            if (size % height == 0) {
                // 가로 길이 구하기
                int width = size / height;

                // 3-2.가운데 노란색 개수가 맞는지
                // (가로-2)*(세로-2)가 yellow와 같은지
                if ((width - 2) * (height - 2) == yellow) {
                    // 맞으면 리턴
                    return new int[] {width, height};
                }
            }
        }
        return null;
    }
}
