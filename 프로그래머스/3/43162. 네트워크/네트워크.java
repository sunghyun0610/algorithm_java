import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int row = computers.length;
        int col = computers[0].length;
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                bfs(computers,visited,i);
                answer++;
            }
        }
        return answer;
    }
    void bfs(int[][] computers, boolean[] visited, int node){
        Queue<Integer> queue = new LinkedList<>();
        visited[node] = true;
        queue.add(node);
        while(!queue.isEmpty()){
            int currNode = queue.poll();
            for(int i=0; i<computers[currNode].length;i++){
                int nextNode = i;
                if(computers[currNode][nextNode]==1 && !visited[nextNode]){
                    visited[nextNode] = true;
                    queue.add(nextNode);
                }
            }
        }
        return;
    }
}
//네트워크의 개수를 구하라