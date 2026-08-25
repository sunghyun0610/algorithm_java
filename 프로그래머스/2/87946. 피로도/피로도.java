class Solution {
    static int max = 0;
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        int dungeonCnt = dungeons.length;
        boolean[] visited = new boolean[dungeonCnt];
        dfs(dungeons,k,visited,0);
        return max;
    }
    private void dfs(int[][] dungeons, int hp, boolean[] visited, int cnt){
        // System.out.println(hp);
        
        for(int i=0;i<dungeons.length;i++){
            if(!visited[i] && hp>=dungeons[i][0]){//탐험 가능한 경우
                visited[i]=true;
                // System.out.println("i" + hp + "최소 피로도 : "+dungeons[i][0] + "cnt : "+cnt);
                max = Math.max(max,cnt+1);
                // System.out.println(max);
                dfs(dungeons,hp-dungeons[i][1],visited,cnt+1);
                
                visited[i]=false;
                
            }
            
        }
        return;
        
    }
}
//시작하기 위한 :최소 필요도
// 탐험 후 : 소모 피로도
//유저가 탐험할 수 있는 최대 던전 수
//던전 수가 8이하 -> 전체탐색 가능
//그리디는 아니다