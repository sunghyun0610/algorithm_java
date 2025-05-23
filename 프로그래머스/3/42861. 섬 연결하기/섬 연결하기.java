import java.util.*;
class Solution {
    static int[] parent;
    static int cost;
    public int solution(int n, int[][] costs) {
        int answer = 0;
        parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;//일단 자기자신과 연결
        }
        //간선 오름차순으로 정렬
        Arrays.sort(costs,(a,b)->a[2]-b[2]);
        for(int[] edge: costs){
            int a = edge[0];
            int b = edge[1];
            int cost = edge[2];
            if(find(a)!=find(b)){
                union(a,b);
                answer+=cost;
            }
        }
        
        return answer;
    }
    static void union(int x, int y){//두 노드를 연결시키는 메소드
        int parent_x = find(x);
        int parent_y = find(y);
      
        if(parent_x<parent_y)
            parent[parent_y]=parent_x;
        else parent[parent_x]=parent[y];
        
    }
    
    static int find(int x){//한 노드에서 최상위 부모노드를 찾는 메소드
        if(x!=parent[x]){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
}
//1. 선택되지 않은 간선들 중 가중치가 최소인 간선 선택(그리디)
//2. 선택한 간선이 기존 스패닝 트리랑 사이클을 이루지 않는지 확인 -> 유니온 파인드
// 3.V-1이 될때까지 반복