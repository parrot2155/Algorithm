class Solution {
    public int solution(int[][] sizes) {
        // 최종적으로 구할 가로세로길이
        int x = 0; 
        int y = 0; 

        for (int i = 0; i < sizes.length; i++) {
            int w = sizes[i][0]; // 현재 명함의 가로
            int h = sizes[i][1]; // 현재 명함의 세로
            
            int big = 0;   // 현재 명함에서 긴 쪽
            int small = 0; // 현재 명함에서 짧은 쪽

            // 1. 현재 명함에서 긴 쪽과 짧은 쪽을 구분
            if (w > h) {
                big = w;
                small = h;
            } else {
                big = h;
                small = w;
            }

            // 2. 전체 명함 중 긴 쪽의 최대값 갱신
            if (big > x) {
                x = big;
            }

            // 3. 전체 명함 중 짧은 쪽의 최대값 갱신
            if (small > y) {
                y = small;
            }
        }

        // 4. 결과 출력
        return x * y;
    }
}