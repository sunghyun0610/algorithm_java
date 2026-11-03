import java.util.*;
class Solution {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static class Point{
        int x;
        int y;
        int cnt;
        Point(int x, int y,int cnt){
            this.x=x;
            this.y=y;
            this.cnt = cnt;
        }
    }
    public int solution(int[][] maps) {
        int answer = 0;
        int row = maps.length;
        int col = maps[0].length;
        boolean[][] visited = new boolean[row+1][col+1];
        answer = bfs(maps,0,visited);
        return answer;
    }
        int bfs(int[][] maps, int cnt, boolean[][] visited){
            Queue<Point> queue = new LinkedList<>();
            queue.add(new Point(0,0,1));
            visited[0][0] = true;
            int row = maps.length;
            int col = maps[0].length;
            while(!queue.isEmpty()){
                Point currPoint = queue.poll();
                int currX = currPoint.x;
                int currY = currPoint.y;
                int currCnt = currPoint.cnt;
                // System.out.println("currX : " +currX);
                // System.out.println("currY : " +currY);
                if(currX == row-1 && currY == col-1){
                    return currCnt;
                }
                for(int i=0; i<4;i++){
                    int nextX = currX+dx[i];
                    int nextY = currY+dy[i];
                    if(nextX>=0 && nextX<row && nextY>=0 && nextY<col &&
                      !visited[nextX][nextY] && maps[nextX][nextY]==1){
                        visited[nextX][nextY] = true;
                        queue.add(new Point(nextX, nextY,currCnt+1));
                    }
            }
        }
    return -1;
    }
}
//도착 하기 위한 칸의 최소 개수 -> bfs
//도착할 수 없을 떄는 -1 return