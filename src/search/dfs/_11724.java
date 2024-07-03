package search.dfs;

import java.util.ArrayList;
import java.util.Scanner;

public class _11724 {
    public static void main(String[] args){
        //정점 개수 N, 간선의 개수 M
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();//정점의 개수
        int M=sc.nextInt();//간선의 개수
        boolean[] visited=new boolean[N+1];//노드 방문했는지 알아보는 함수
        int components=0;//연결요소 카운트
        //그래프 인접리스트로 구현
        ArrayList<ArrayList<Integer>> graph =new ArrayList<>(N+1);//이중 리스트로 그래프 구현
        // 정점 번호가 1부터 N까지 주어지기 때문에 코드에서 인덱스를 맞추기 위해 N+1 크기의 리스트와 배열을 선언
        for(int i=0;i<=N;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<M;i++){
            int u=sc.nextInt();//간선 끝점1
            int v=sc.nextInt();//간선 끝점2
            graph.get(u).add(v);
            graph.get(v).add(u);//방향 없으므로
        }

        for(int i=1;i<=N;i++){
            if(!visited[i]){
                dfs(i, graph, visited);
                components++;
            }
        }
        System.out.println(components);
    }
    public static void dfs(int node, ArrayList<ArrayList<Integer>> graph, boolean[] visited){
        visited[node]=true;//방문했다는 뜻
        for(int neighbor: graph.get(node)){
            if(!visited[neighbor]){
                dfs(neighbor,graph,visited);
            }
        }

    }
}
//연결 요소로 본다면, 나누어진 각각의 그래프를 연결 요소라고 한다.