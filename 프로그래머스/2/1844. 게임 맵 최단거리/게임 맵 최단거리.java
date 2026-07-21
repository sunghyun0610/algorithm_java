import java.util.*;
class Solution {
    static int[] dx= {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static class Point{
        int x;
        int y;
        Point(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public int solution(int[][] maps) {
        int answer = 0;
        int endX = maps.length-1;
        int endY = maps[0].length-1;
        return bfs(maps,0,0,endX,endY);
    }
    
    public static int bfs(int [][] maps, int startX, int startY, int endX, int endY){
        Queue<Point> queue = new LinkedList<>();
        Queue<Integer> cntQueue = new LinkedList<>();
  
        cntQueue.add(1);
        int row = maps.length;// 행
        int col = maps[0].length;//열
        boolean[][] visited = new boolean[row][col];
        queue.add(new Point(startX,startY));
        while(!queue.isEmpty()){
            Point currPoint = queue.poll();
            int currX= currPoint.x;
            int currY= currPoint.y;
            int cnt = cntQueue.poll();
            if(currX==endX && currY == endY){
                return cnt;
            }
            for(int i=0;i<4;i++){
                int nextX = currX + dx[i];
                int nextY = currY + dy[i];
                if(nextX>=0 && nextY>=0 && nextX<row && nextY<col &&!visited[nextX][nextY] && maps[nextX][nextY]==1 ){
            if(currX==endX && currY == endY){
                return cnt+1;
            }
                    queue.add(new Point(nextX,nextY));
                    visited[nextX][nextY]=true;
                    cntQueue.add(cnt+1);
                }
            }
        }
        return -1;
    }
}

// 1은 갈수있는 통로, 0은 벽
// 최단 거리이므로 bfs로 푼다
// 다막혀서 아예못가는 경우는 미리 계산을 해야하네 이거.