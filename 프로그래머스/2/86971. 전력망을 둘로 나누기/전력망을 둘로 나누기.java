//1. 2차원배열로 연결상태를 저장
//2. 연결을 하나씩 끊어보며
//3. 시작점과 연결된 송전탑 개수 카운트
//4. 두 전력망의 개수차이가 최소일때 값 리턴

import java.util.*;

class Solution {
    int[][] map; // 전력망 연결 상태를 저장할 2차원 배열

    public int solution(int n, int[][] wires) {
        int answer = 100; // 최솟값을 구할 변수
        
        // 1. 인접 행렬 생성 (송전탑 번호가 1부터 시작하므로 크기 n+1)
        map = new int[n + 1][n + 1];

        // 전선 연결 정보 넣기
        for (int[] wire : wires) {
            map[wire[0]][wire[1]] = 1;
            map[wire[1]][wire[0]] = 1;
        }

        // 2. 전선을 하나씩 끊어보며 완전 탐색
        for (int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];

            // (1) 전선 끊기 - 0으로.
            map[a][b] = 0;
            map[b][a] = 0;

            // (2) BFS를 통해 한쪽 전력망의 송전탑 개수 세기
            int cnt = bfs(n, a); // 끊어진 두 그룹 중 a가 속한 그룹의 크기를 카운트

            // (3) 두 전력망의 차이 계산
            // 전체 n개 중 한쪽이 cnt개라면, 다른 쪽은 (n - cnt)개
            int diff = Math.abs(cnt - (n - cnt));
            answer = Math.min(answer, diff);

            // (4) 전선 복구 - 다시 1로
            map[a][b] = 1;
            map[b][a] = 1;
        }

        return answer;
    }

    // BFS 함수: 시작점과 연결된 모든 송전탑의 개수를 반환
    public int bfs(int n, int start) {
        int count = 1; // 시작점도 포함하므로 1부터 시작
        boolean[] visited = new boolean[n + 1]; // 방문 체크 배열
        Queue<Integer> queue = new LinkedList<>(); // BFS용 큐
        
        // 초기 설정
        queue.offer(start);
        visited[start] = true;

        // 큐가 빌 때까지 반복 (연결된 곳이 없을 때까지)
        while (!queue.isEmpty()) {
            int current = queue.poll(); // 현재 위치 꺼내기

            // 현재 위치와 연결된 다음 송전탑i 찾기
            for (int i = 1; i <= n; i++) {
                // 연결되어 있고(1), 아직 방문하지 않았다면(!visited)
                if (map[current][i] == 1 && !visited[i]) {
                    visited[i] = true; // 방문 도장 찍기
                    queue.offer(i);    // 큐에 넣기
                    count++;           // 개수 증가
                }
            }
        }
        return count; // 연결된 총 개수 반환
    }
}