import java.util.*;

class Solution {
    static int[] dx ={-1,1,0,0};
    static int[] dy ={0,0,-1,1};
    static int oilCnt;
    
    static class Node{
        int x;
        int y;
        int size;
        Node(int x, int y, int size){
            this.x = x;
            this.y = y;
            this. size = size;
        }
    }
    public int solution(int[][] land) {
        int answer = 0;
        //모든 덩어리들을 일단 다 구함 -> 포함되는 col값도 같이 구함
        Map<Integer, Integer> colMap = new HashMap<>();
        int row = land.length;
        int col = land[0].length;
        for(int i=0;i<col;i++){
            colMap.put(i,0);
        }// 열 : 석유개수
        boolean[][] visited = new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(land[i][j]==1 && !visited[i][j]){
                    oilCnt=0;
                    Set<Integer> set = new HashSet<>();//포함되는 열을 담은 set
                    set.add(j);
                    bfs(land,visited,i,j,set);
                    for(int k : set){
                        colMap.put(k, colMap.get(k)+oilCnt);
                    }
                }
            }
        }
        for(Integer k : colMap.keySet()){
            answer = Math.max(answer, colMap.get(k));
        }
        return answer;
    }
    private void bfs(int[][] land, boolean[][] visited, int x, int y, 
                             Set<Integer> set){
        visited[x][y] = true;
        set.add(y);
        int row = land.length;
        int col = land[0].length;
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x,y,1));
        oilCnt++;
        while(!queue.isEmpty()){
            Node currNode = queue.poll();
            int currX = currNode.x;
            int currY = currNode.y;
            int currSize = currNode.size;
            for(int i=0;i<4;i++){
                int nextX = currX +dx[i];
                int nextY = currY +dy[i];
                if(nextX>=0 && nextX<row && nextY>=0 && nextY<col
              &&land[nextX][nextY]==1 && !visited[nextX][nextY]){
                    visited[nextX][nextY]=true;
                    set.add(nextY);
                    queue.add(new Node(nextX,nextY,currSize+1));
                    oilCnt++;
                }
            }
        }
        return;
    }
    
    
    private void findOilSize(int[][] land, boolean[][] visited, int x, int y, 
                             Set<Integer> set){
        visited[x][y] = true;
        oilCnt++;
        int row = land.length;
        int col = land[0].length;
        for(int i=0;i<4;i++){
            int nextX = x+dx[i];
            int nextY = y+dy[i];
            if(nextX>=0 && nextX<row && nextY>=0 && nextY<col
              &&land[nextX][nextY]==1 && !visited[nextX][nextY]){
                visited[nextX][nextY] = true;
                set.add(nextY);
                findOilSize(land,visited,nextX,nextY,set);
            }
        }
    }
}