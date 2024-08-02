package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1260 {

    static boolean [] visited;//방문여부 기록
    static int[][] graph;
    static Queue<Integer> queue=new LinkedList<>();
    public static void main(String[] args) throws IOException {


        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        //StringTokenizer는 문자열을 특정 구분자를 기준으로 분리하는 데 사용됩니다. 구분자는 기본적으로 공백이며, 다른 구분자를 지정할 수도 있습니다.
        int N= Integer.parseInt(st.nextToken());//정점의 개수 입력
        int M= Integer.parseInt(st.nextToken());//간선의 개수 입력
        int V= Integer.parseInt(st.nextToken());//정점의 번호 입력

        visited=new boolean[N+1];//방문여부 기록
        graph=new int[N+1][N+1];//정점번호가 1~N번까지니까 0번안쓰고 1부터 시작하게 함.


        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());//새로운 줄을 읽어서 다시 토큰화해야 할 때마다 새로운 StringTokenizer 객체를 생성해야 합니다. 이는 각 줄의 데이터를 독립적으로 처리하기 위해 필요합니다
            int idx1=Integer.parseInt(st.nextToken());
            int idx2=Integer.parseInt(st.nextToken());
            graph[idx1][idx2]++;
            graph[idx2][idx1]++;//양방향 그래프니까

        }//인접행렬값 증가시키기
        dfs(V);

//bfs 를위해 초기화 다시
        visited=new boolean[N+1];//방문여부 기록
        System.out.println();

        bfs(V);

    }
    public static void dfs(int node){//지금 시작하는 노드
        visited[node]=true;//시작 노드 방문처리
        System.out.print(node +" ");//방문한 노드를 출력
        for(int i=1;i<graph.length;i++){//그다음 내가 갈 수 있는 간선을 찾아야함.
            if(graph[node][i]==1 && !visited[i]){//현재 정점에서 인접한 다른 정점이있어? 그리고 그 다른 정점이 아직 방문안했어?? 그럼 일단 여기서 난 기다려!!->이게 재귀 함수의 종료조건이다.
                dfs(i);
            }
        }

    }

    public static void bfs(int node){
        queue.add(node);//출발점의 좌표 넣기
        //큐가 곧 방문 스케쥴
        visited[node]= true;//BFS는 일단 스케줄 순서대로 무조건 방문 하니까, 스케줄 잡은 정점은 이미 큐에 먼저 들어갔다고(방문했다고) 표시하기

        while(!queue.isEmpty()){
            node= queue.poll();//현재 방문처리하는 정점 -> 1번 너 나와 시전
            System.out.print(node +" ");

            for(int next=1; next<graph.length;next++){//1번 너 친구 누구있어!! 시전
                if(graph[node][next] ==1 && !visited[next]){//친구 검사후 방문안했으면 큐 스케줄링에 다시 넣기
                    queue.add(next);
                    visited[next]=true;
                }
            }
        }


    }

}
/*
* 정점의 개수 1000개 간선 개수 10000개 -> 인접행렬은 낭비가 좀 심하겠네
* bfs/dfs는 모든 정점을 다 한번씩은 순회하는 그래프 탐색 알고리즘.
* */