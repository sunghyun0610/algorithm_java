import java.util.*;
class Solution {
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int max = 0;
    static class Node{
        int x;
        int y;
        Node(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public int solution(int[][] land) {
        int answer = 0;
        int row = land.length;
        int col = land[0].length;//시추관 개수
        boolean[][] visited = new boolean[row][col];
        Map<Integer,Integer> pipeMap = new HashMap<>();
        for(int i=0;i<col;i++){
            pipeMap.put(i,0);// i번째 파이프에 석유카운트한거
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(land[i][j]==1 && !visited[i][j]){
                    visited[i][j] = true;
                    bfs(new Node(i,j),land,visited,pipeMap);
                }
            }
        }
        for(int k:pipeMap.keySet()){
            int value = pipeMap.get(k);
            answer = Math.max(answer,value);
        }
        return answer;
    }
    
    static int bfs(Node startNode, int[][]land, boolean[][] visited, 
                   Map<Integer,Integer> pipeMap){
        int sum=1;
        Set<Integer> usedPipe = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(startNode);
        int row = land.length;
        int col = land[0].length;//시추관 개수
        while(!queue.isEmpty()){
            Node currNode = queue.poll();
            int startX = currNode.x;
            int startY = currNode.y;
            usedPipe.add(startY);
            for(int i=0;i<4;i++){
                int nextX = startX + dx[i];
                int nextY = startY + dy[i];
                if(nextX>=0 && nextX<row && nextY>=0 && nextY<col&&
               !visited[nextX][nextY] && land[nextX][nextY]==1){
                    sum++;
                    queue.add(new Node(nextX,nextY));
                    visited[nextX][nextY] = true;
            }
        }
    }
        for(int k : usedPipe){
            pipeMap.put(k,pipeMap.get(k)+sum);
            // System.out.println("속한 key : "+k);
        }
        return sum;
}
    
}
//수직으로 뚫는다 시추관
//dfs로 요소 개수 다 더하면 될거같은데
//석유는 열개수만큼 시추관 설치가능
//이게 visited되면서 길을 못찾을수가있는데?
//dfs하면 갇혀버릴수도?