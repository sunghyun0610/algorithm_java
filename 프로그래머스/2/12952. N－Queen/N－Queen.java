import java.util.*;
class Solution {
    int[] dx = {-1,1,0,0,-1,-1,1,1};
    int[] dy = {0,0,-1,1,-1,1,-1,1};//상하좌우 대각선 방향 표시 완료
    
    static class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    static int cnt= 0;
    
    public int solution(int n) {
        int answer = 0;
        int [][] map = new int[n][n];//체스판 생성
        boolean[][] visited = new boolean[n][n]; 
        for(int i=0;i<map[0].length;i++){
            attackAvailable(map, new Point(0,i));
            dfs(map,1);
            removeAttack(map,new Point(0,i));
        }
        // System.out.println(cnt);
        
        return cnt;
    }
  
    private void dfs(int[][] map, int cntQueen){
        if(cntQueen == map.length){
            cnt++;
            return;
        }
        for(int i=0;i<map[0].length;i++){
            if(map[cntQueen][i]==0){
                attackAvailable(map, new Point(cntQueen,i));
                dfs(map,cntQueen+1);
                removeAttack(map,new Point(cntQueen,i));
                // visited[cntQueen][i] = false;
            }
        }
  
     
        
        
        
    }
    private void attackAvailable(int[][] map ,Point point){
        int currX = point.x;
        int currY = point.y;
        int row = map.length;
        int col = map[0].length;
        map[currX][currY]++;
        for(int i=0;i<8;i++){//방향은 정함
            int nextX = currX + dx[i];
            int nextY = currY + dy[i];
            while(nextX>=0 && nextX<row && nextY>=0 && nextY<col){
                map[nextX][nextY]++;
                nextX +=dx[i];
                nextY +=dy[i];
            }
        }
    }
    private void removeAttack(int[][] map, Point point){
    int currX = point.x;
    int currY = point.y;
    int row = map.length;
    int col = map[0].length;

    map[currX][currY]--;

    for(int i = 0; i < 8; i++){
        int nextX = currX + dx[i];
        int nextY = currY + dy[i];

        while(nextX >= 0 && nextX < row &&
              nextY >= 0 && nextY < col){

            map[nextX][nextY]--;

            nextX += dx[i];
            nextY += dy[i];
        }
    }
}
}
// n*n 정사각형
//n개의 퀸이 서로 공격 못하도록 배친하는 경우의 수
//일단 n개배치한다 -> n개중에 이어지는게 있으면 그건 삭제
//n queen 규칙 : 한행에 한개