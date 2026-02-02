import java.util.Arrays;
//1. 비용순으로 정렬
//2. 비용이 제일 작은 다리부터 건설했다고 치고 시작섬 부터 탐색.
//3. 비용이 가장 작은 다리 중 한 쪽은 방문했고 다른 한쪽은 방문 안한 섬이라면 건설.
class Solution {
    public int solution(int n, int[][] costs) {
        int answer = 0;
        
        // 1. 비용을 기준으로 오름차순 정렬
        Arrays.sort(costs, (a, b) -> a[2] - b[2]);
        
        // 2. 방문 여부를 체크할 배열
        boolean[] visited = new boolean[n];
        
        // 3. 시작점. 가장 비용이 적은 다리가 시작하는 섬
        visited[costs[0][0]] = true;
        
        int connectedCount = 1;
        
        // 4. 모든 섬이 연결될 때까지 반복
        while (connectedCount < n) {
            
            for (int i = 0; i < costs.length; i++) {
                
                int from = costs[i][0];
                int to = costs[i][1];
                int cost = costs[i][2];
                
                // 5. 한쪽은 방문했고, 다른 쪽은 방문 안 한 다리 찾기
                if ((visited[from] && !visited[to]) || (visited[to] && !visited[from])) {
                    
                    // 새로 연결된 섬을 방문 처리
                    visited[from] = true;
                    visited[to] = true;
                    
                    // 다리 건설 비용 추가
                    answer += cost;
                    
                    // 연결된 섬 개수 증가
                    connectedCount++;

                    break;
                }
            }
        }
        
        return answer;
    }
}