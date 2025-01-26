

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] graph;
    static boolean[] visited;
    static int result=0;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        st =new StringTokenizer(br.readLine());
        int links = Integer.parseInt(st.nextToken());
        graph = new int[N+1][N+1];
        visited= new boolean[N+1];
        for(int i=0;i<links;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y]=1;
            graph[y][x]=1;
        }
        dfs(1);
        System.out.println(result);

    }
    static void dfs(int x){
        visited[x]= true;
        for(int i=1;i<N+1;i++){
            if(graph[x][i]==1 && visited[i]==false){
                result++;
                dfs(i);
            }
        }
    }
}
