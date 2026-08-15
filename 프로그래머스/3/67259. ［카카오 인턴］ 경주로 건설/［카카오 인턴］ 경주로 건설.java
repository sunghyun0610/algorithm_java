import java.util.*;

class Solution {
    static int[] dx = {1,-1,0,0};//아래로
    static int[] dy = {0,0,-1,1};//오른쪽으로
    
    static class Node{
        int x;
        int y;
        int dis;//방향 위쪽(0)인지 오른쪽(1)인지
        int cost;
        Node(int x, int y, int dis, int cost){
            this.x = x;
            this.y = y;
            this.dis = dis;
            this.cost = cost;
        }
    }
    public int solution(int[][] board) {
        int answer = 0;
        int row = board.length;
        int[][][] dpMap = new int[row][row][2];//지금까지 최소 비용을 기록해 놓는 배열
        for(int[][] k : dpMap){
            for(int[] l :k){
                l[0] = Integer.MAX_VALUE;
                l[1] = Integer.MAX_VALUE;
            }
        }
        bfs(board,dpMap,row-1,row-1);
        return Math.min(dpMap[row-1][row-1][0],dpMap[row-1][row-1][1]);
    }
    static void bfs(int[][] board, int[][][] dpMap, int endX, int endY){
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0,0,0,0));
        while(!queue.isEmpty()){
            Node currNode = queue.poll();
            int currX = currNode.x;
            int currY = currNode.y;
            int currDis = currNode.dis;
            int currCost = currNode.cost;
            for(int i=0;i<4;i++){ //첫번째 칸인 경우
                int nextX = currX + dx[i];
                int nextY = currY +dy[i];
                int nextDis = i<2 ? 1:0; // 1이 상하방향, 0 이 좌우방향을 뜻함
                int nextCost = 0;
                if(nextDis==currDis) nextCost = currCost +100;
                else nextCost = currCost + 600;
                if(nextX>=0 && nextX<=endX && nextY>=0 && nextY <=endY
                  &&board[nextX][nextY]==0 && dpMap[nextX][nextY][nextDis]>nextCost){
                    
                     if(currX == 0 && currY == 0){
                       dpMap[nextX][nextY][nextDis] = 100;
                       queue.add(new Node(nextX,nextY,nextDis,100));
                    }
                    else{//첫번 째 칸 이외의 경우
                        dpMap[nextX][nextY][nextDis] = nextCost;
                        queue.add(new Node(nextX,nextY,nextDis,nextCost));
                        
                    }
                }
               
            }
        }
    }
}
//경주로를 건설하는데 필요한 최소 비용
//25*25시 dfs로 모든 경로 탐색은 비효율 -> bfs로 가야한다
//만약 경주로 건설이 다 1씩 비용이라면 visited으로 처리가능
//but 코너 변수로 한번에 1쓸지, 6쓸지 매번 고려해야함