import java.util.*;

class Solution {
    static int max;
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        int dCnt = dungeons.length;
        max=0;
        boolean[] visited = new boolean[dCnt+1];
        dfs(k,dungeons,visited,0);
        
        return max;
    }
    void dfs(int hp, int[][] dungeons, boolean[] visited, int cnt){
        max=Math.max(max,cnt);
        if(hp<=0){
            return;
        }
        for(int i=0;i<dungeons.length;i++){
            if(hp>=dungeons[i][0] && !visited[i]){
                visited[i] = true;
                dfs(hp-dungeons[i][1], dungeons, visited, cnt+1);
                visited[i]=false;
            }
        }
    }
}
//탐험할 수 있는 최대 던전 수
// 그리디는 아님