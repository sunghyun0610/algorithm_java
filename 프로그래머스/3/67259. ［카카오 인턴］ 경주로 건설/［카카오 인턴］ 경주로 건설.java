import java.util.Queue;
import java.util.LinkedList;

class Solution {
    static class Node {
        int x;
        int y;
        int dir;//방향
        int cost;//값
        
        Node(int x,int y,int dir, int cost){
            this.x=x;
            this.y=y;
            this.dir = dir;
            this.cost = cost;
        }
    }
    
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static boolean[][] visited;
    static int minMoney;
    public int solution(int[][] board) {
        int answer = 0;
        int row = board.length;
        minMoney = Integer.MAX_VALUE;
        visited = new boolean[row][row];
        Node startNode = new Node(0,0,0,0);
        bfs(startNode,row-1,row-1,board);
        answer=minMoney;
        return answer;
    }
    static void bfs(Node startNode, int endX, int endY,int[][] board){
        Queue<Node> queue = new LinkedList<>();
        queue.add(startNode);
        int[][][] cost = new int[endX+1][endX+1][2];
        for(int i=0;i<=endX;i++){
            for(int j=0;j<=endX;j++){
                cost[i][j][0] = Integer.MAX_VALUE;
                cost[i][j][1] = Integer.MAX_VALUE;
            }
        }
        while(!queue.isEmpty()){
            Node currNode = queue.poll();
            int currX = currNode.x;
            int currY = currNode.y;
            int currDir = currNode.dir;
            int currCost = currNode.cost;
            if(currX==endX && currY == endY){
                minMoney = Math.min(minMoney, currCost);
            }
            
            for(int i=0;i<4;i++){
                int nextX = currX + dx[i];
                int nextY = currY + dy[i];
                int nextDir = i<2 ? 1 : 0;
                int nextCost =0;
                if(currDir == nextDir){
                    nextCost = currCost + 100;
                }
                else{
                    nextCost = currCost + 600;
                }
                if(nextX>=0 && nextX<=endX && nextY>=0 && nextY<=endY &&
                  board[nextX][nextY]==0 && nextCost < cost[nextX][nextY][nextDir]){
                    if(currX == 0 && currY == 0){//처음인 경우 방향고려 X
                        cost[nextX][nextY][nextDir]= currCost+100;
                        queue.add(new Node(nextX, nextY, nextDir, currCost+100));
                    }else{
                        cost[nextX][nextY][nextDir]= nextCost;
                        queue.add(new Node(nextX, nextY, nextDir, nextCost));
                    }
                    
                }
            }
        }
        
    }
}
//전체탐색 -> dfs + 백트래킹(최소 비용보다 비용 커지면 return)
//방향 꺽을때마다 코너 필요함
// way : 1 상하로 / way : 0 좌우로