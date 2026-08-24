import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.*;

class Solution {
    static class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    private static int[] dx = {-1,1,0,0};
    private static int[] dy = {0,0,-1,1};
    // static int oilSum;
    public int solution(int[][] land) {
        int answer = 0;
        int row = land.length;
        int col = land[0].length;//열 개수
        Map<Integer,Integer> map = new HashMap<>();// 시추관 : 석유개수
     
        boolean[][] visited = new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(land[i][j]==1 && !visited[i][j]){
                    int oilSum=1;
                    Set<Integer> colSet = new HashSet<>();
                    colSet.add(j);
                    oilSum = bfs(i,j,land,visited,colSet);
                    // System.out.println(oilSum);
                    for(int k : colSet){
                        // System.out.println("해당된 열 set : ")
                        map.put(k,map.getOrDefault(k,0)+oilSum);
                    }
                }
            }
        }
        if(map.size()==0) return 0;
        for(int key : map.keySet()){
            int oil = map.get(key);
            // System.out.println("석유관 col : "+key + " oil양 : "+oil);
            answer = Math.max(answer,oil);
        }
        
        return answer;
    }
    static int bfs(int x, int y, int[][] land, boolean[][] visited, Set<Integer> colSet){
        visited[x][y] = true;
        int row = land.length;
        int col = land[0].length;//열 개수
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x,y));
        int cnt=1;
        while(!queue.isEmpty()){
            Point currPoint = queue.poll();
            int currX = currPoint.x;
            int currY = currPoint.y;
            for(int i=0;i<4;i++){
                int nextX = currX + dx[i];
                int nextY = currY + dy[i];
                  if(nextX>=0 && nextX<row && nextY>=0&& nextY<col&&
              land[nextX][nextY]==1 && !visited[nextX][nextY]){
                      visited[nextX][nextY] = true;
                      queue.add(new Point(nextX, nextY));
                      cnt++;
                      colSet.add(nextY);
                  }
            }
        }
        return cnt;
    }
    
//     static int dfs(int x, int y, int[][] land, boolean[][] visited, Set<Integer> colSet){
//         visited[x][y] = true;
//         int row = land.length;
//         int col = land[0].length;//열 개수
//         int sum = 1;
//         for(int i=0;i<4;i++){
//             int nextX = x+dx[i];
//             int nextY = y+dy[i];
//             if(nextX>=0 && nextX<row && nextY>=0&& nextY<col&&
//               land[nextX][nextY]==1 && !visited[nextX][nextY]){
//                 colSet.add(nextY);
//                 sum+=dfs(nextX,nextY,land,visited,colSet);
                
//             }
//         }
//         return sum;
//     }
}
//한 열을 뚫는 시추관
//가장 많은 석유를 뽑을 수 있는 시추관의 위치를 찾아라
//0이면 빈땅, 1이면 석유가 있는 땅
//일단 석유덩어리 모두찾고 -> 해당되는 열을 기록하면되자나 Map으로 기록하면될듯?