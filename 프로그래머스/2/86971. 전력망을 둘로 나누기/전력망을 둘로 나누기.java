import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = -1;
        //리스트로 그래프 구현
        List<Integer>[] tree = new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            tree[i] = new ArrayList<>();
        }
        for(int[] wire : wires){
            int start = wire[0];
            int end = wire[1];
            tree[start].add(end);
            tree[end].add(start);
        } //트리 구현완료
        boolean[] visited = new boolean[n+1];
        int cnt1 = 0;
        int diff = 0;
        int min = Integer.MAX_VALUE;
        int wireLen = wires.length;
        for(int i=1;i<=n;i++){
            visited = new boolean[n+1];
            cnt1=bfs(1,tree,visited,i);
            int cnt2=n-cnt1;
            if(cnt1<cnt2) diff=cnt2-cnt1;
            else diff = cnt1-cnt2;
            min = Math.min(min,diff);
        }
        
    
        return min;
    }
    private int bfs(int x,List<Integer>[] tree, boolean[] visited, int restrictNode){
        visited[x] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        int cnt = 1;
        while(!queue.isEmpty()){
            int currNode = queue.poll();
            List<Integer> linkNode = tree[currNode];
            // System.out.println(currNode+" 에연결된 노드들 :"+linkNode.toString());
            if(linkNode.size()>0){
                for(int i=0;i<linkNode.size();i++){
                    int nextNode = linkNode.get(i);
                    if(nextNode == restrictNode) continue;
                    if(!visited[nextNode]){
                        visited[nextNode] = true;
                        queue.add(nextNode);
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
//n개의 송전탑이 하나의 트리 형태로 연결되어 있다. -> 전선 하나 끊어서 네트워크를 2개로 분할하려 한다
//두 전력망의 송전탑 개수를 최대한 비슷하게 맞추고자 한다
//두 전력망이 가지고 있는 송전탑의 개수차이를 return하시오
//전체 노드의 개수 n