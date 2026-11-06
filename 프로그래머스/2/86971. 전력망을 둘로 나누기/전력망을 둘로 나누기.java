import java.util.*;
class Solution {
    static int sum;
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        List<Integer>[] tree = new ArrayList[n+1];//연결 표현해야지
        for(int i=0; i<=n;i++){
            tree[i] = new ArrayList<>();
        }
        for(int i=0;i<wires.length;i++){
            int start = wires[i][0];
            int end = wires[i][1];
            tree[start].add(end);
            tree[end].add(start);
        }
        sum=0;
        int sum2 =0;
        int diff=0;
        boolean[] visited = new boolean[n+1];
        for(int i=0;i<wires.length;i++){ //끊는 노드 번호임
            int start = wires[i][0];
            int end = wires[i][1];
            sum=0;
            visited = new boolean[n+1];
            dfs(tree,1,start,end,0,visited);
            sum2 = n-sum;
            diff = (int)Math.abs(sum-sum2);
            // System.out.println(diff);
            answer=Math.min(answer,diff);
            
        }
        return answer;
    }
    void dfs(List<Integer>[] tree, int node, int startX, int endX,int cnt, boolean[] visited){
        sum++;
        List<Integer> list = tree[node];
        visited[node]=true;
        for(int i=0;i<list.size();i++){
            int nextNode = list.get(i);
            if(!visited[nextNode] && !(node==startX && nextNode==endX) && !(node==endX && 
                                                                        nextNode==startX)){
                visited[nextNode] = true;
                dfs(tree,nextNode,startX,endX,cnt+1,visited);
            }
        }
        
    }
}