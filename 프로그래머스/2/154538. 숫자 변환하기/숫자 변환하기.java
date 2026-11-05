import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        boolean[] visited = new boolean[y+1];
        answer = bfs(x,y,n,visited);
        return answer;
    }
    static int bfs(int curr, int target, int n, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> cntQueue = new LinkedList<>();
        queue.add(curr);
        visited[curr]=true;
        cntQueue.add(0);
        while(!queue.isEmpty()){
            int currNum = queue.poll();
            int currCnt = cntQueue.poll();
            if(currNum==target) return currCnt;
            for(int i=0;i<3; i++){
                int nextNum = currNum;
                if(i==0) nextNum= currNum+n;
                else if(i==1) nextNum = currNum*2;
                else if(i==2) nextNum = currNum*3;
                
                if(nextNum<=target && !visited[nextNum]){
                    queue.add(nextNum);
                    visited[nextNum] = true;
                    cntQueue.add(currCnt+1);
                }
            }
        }
        return -1;
    }
}
// x를 y로 변환하자
//사용 가능 연산
//1. x+n
// 2. x*2
// 3. x*3
//최소연산 횟수