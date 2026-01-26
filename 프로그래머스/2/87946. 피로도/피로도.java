class Solution {
    // 최대 던전 수를 저장할 변수
    static int maxDungeons = 0;
    // 방문 여부를 체크할 배열
    static boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        
        visited = new boolean[dungeons.length];

        // DFS 탐색 시작 (현재 피로도, 던전 정보, 현재 탐험한 던전 수)
        dfs(k, dungeons, 0);

        return maxDungeons;
    }

    public void dfs(int currentFatigue, int[][] dungeons, int count) {
        // 현재까지 탐험한 던전 수가 기존 최대값보다 크다면 갱신
        if (count > maxDungeons) {
            maxDungeons = count;
        }

        // 모든 던전을 순회하며 탐험 시도
        for (int i = 0; i < dungeons.length; i++) {
            // 1. 아직 방문하지 않았고
            // 2. 현재 피로도가 최소 필요 피로도보다 크거나 같다면
            if (!visited[i] && currentFatigue >= dungeons[i][0]) {
                
                // 방문 처리
                visited[i] = true;

                // 피로도 소모, 카운트 + 1
                dfs(currentFatigue - dungeons[i][1], dungeons, count + 1);

                // 다른 순서의 탐색을 위해 방문 처리 해제
                visited[i] = false;
            }
        }
    }
}