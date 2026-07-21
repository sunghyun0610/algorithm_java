import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
class Solution {
    static Set<Integer> dungeonsCnt = new HashSet<>();
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        int dCnt = dungeons.length;
        boolean[] visited = new boolean[dCnt];
        recur(k,dungeons,0,visited);
        int max=0;
        for(int cnt : dungeonsCnt){
            max = Math.max(max,cnt);
        }
        return max;
    }
    public static void recur(int hp, int[][] dungeons,int cnt, boolean[] visited){
        
        for(int i=0;i<dungeons.length;i++){
            if(hp>=dungeons[i][0] && !visited[i]){
                visited[i]=true;
                recur(hp-dungeons[i][1], dungeons, cnt+1, visited);
                visited[i] = false;
            }
            dungeonsCnt.add(cnt);
        }
    }
}
//최소 필요도로 정렬해서 풀면 안됨 -> 그리디 아님
//실제 최소 필요도만 높고 소모 필요도는 엄청 작을수도있기 떄문
// 8개밖에안되니까 모든 던전 다 순서대로 도는 수밖에없네