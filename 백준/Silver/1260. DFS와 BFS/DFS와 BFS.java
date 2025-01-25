

import java.util.*;

public class Main {
    static int [][] graph;
    static int [] dx ={-1,1};
    static boolean[] visited;
    static int N;
    static List<Integer> dResult;
    static List<Integer> bResult;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N =sc.nextInt();
        int M =sc.nextInt();
        int V = sc.nextInt();


        graph = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i=0;i<M;i++){
            int x =sc.nextInt();
            int y = sc.nextInt();
            graph[x][y]=1;
            graph[y][x]=1;
        }
        dResult = new ArrayList<>();
        bResult = new ArrayList<>();
        dfs(V);

        for(int k : dResult){
            System.out.print(k +" ");
        }
        Arrays.fill(visited, false);
        System.out.println();
        bfs(V);


    }
    public static void dfs(int x){
        dResult.add(x);
        visited[x]=true;
        for(int i=1;i<=N;i++){
            if( graph[x][i] == 1 && visited[i]==false){
                dfs(i);
            }
        }
    }

    public static void bfs(int x){
        queue.add(x);
        visited[x] = true;
        while (!queue.isEmpty()){
            x = queue.poll();
            System.out.print(x +" ");
            for(int i=1;i<graph.length;i++){
                if(graph[x][i]==1 && visited[i]==false){
                    queue.add(i);
                    visited[i]= true;
                }
            }
        }
    }
}
//그래프를 어떻게 나타낼까? -> 2차원 배열
