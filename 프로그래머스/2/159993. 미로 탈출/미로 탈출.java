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
            this.cnt=cnt;
        }
    }
    static int leverX;
    static int leverY;
    public int solution(String[] maps) {
        int answer = 0;
        int row = maps.length;
        int col = maps[0].length();
        int startX=0;
        int startY=0;
        leverX=0;
        leverY=0;
        boolean[][] visited = new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                char ch = maps[i].charAt(j);
                if(ch=='S'){
                    startX=i;
                    startY=j;
                    break;
                }
            }
        }
        
        //레버까지 bfs
        // System.out.println("startX :"+ startX + "startY :"+startY);
        int first=bfs(maps,visited,'L',startX,startY);
        visited = new boolean[row][col];//초기화
        //레버 ~ 도착까지 bfs
        if(first==-1) return -1;
        int second =bfs(maps,visited,'E',leverX,leverY);
        if(second==-1) return -1;
        return first + second;
    }
    
    int bfs(String[] maps, boolean[][] visited, char target, int startX, int startY){
        Queue<Point> queue = new LinkedList<>();
        // System.out.println("startX : "+startX + "startY : "+startY);
        queue.add(new Point(startX, startY,0));
        int row = maps.length;
        int col = maps[0].length();
        visited[startX][startY] = true;
        while(!queue.isEmpty()){
            Point currPoint = queue.poll();
            int currX = currPoint.x;
            int currY = currPoint.y;
            int currTime = currPoint.cnt;
            if(maps[currX].charAt(currY) == target) {
                leverX= currX;
                leverY=currY;
                // System.out.println(currTime);
                return currTime;
            }
            
            for(int i=0;i<4;i++){
                int nextX = currX +dx[i];
                int nextY = currY + dy[i];
                if(nextX>=0 && nextX<row && nextY>=0 && nextY < col
                  && !visited[nextX][nextY] && maps[nextX].charAt(nextY)!='X'){
                    // System.out.println("nextX : "+nextX + "nextY : "+nextY);
                    // System.out.println(maps[nextX].charAt(nextY));
                    visited[nextX][nextY] = true;
                    queue.add(new Point(nextX, nextY, currTime+1));
                }
            }
        }
        return -1;
    }
}
//출발점 -> 레버 -> 출구 순서임
//최대한 빠르게 빠져나가는데 걸리는 시간
//bfs네