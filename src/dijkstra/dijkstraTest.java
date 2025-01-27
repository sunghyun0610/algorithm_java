package dijkstra;
import java.util.*;
public class dijkstraTest {
    static final int INF = 1000000000;
    static int N, E;
    static int[][] graph;
    static boolean[] visited;
    static int[] dist;//각 노드까지의 최단 거리 저장하는 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();//정점의 개수
        E = sc.nextInt();//간선의 개수
        graph = new int[N][N];
        dist = new int [N];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    graph[i][j] = 0;
                } else {
                    graph[i][j] = INF;
                }
            }
        }//이상 그래프 2차원 배열로 표현
        for (int i = 0; i < E; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int cost = sc.nextInt();
            graph[x][y] = cost;
            graph[y][x] = cost;
        }
        dijkstra(0);
        for(int k : dist){
            System.out.print(k+" ");
        }


    }

    static void dijkstra(int x) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);// int 배열  [노드 번호, 가중치], lamda : 가중치로만 비교해라
        //우선순위 큐에서 가중치 낮은 것부터 poll되므로 가장 최단거리가 제일 먼저 나온다
        for (int i = 0; i < N; i++) {
            dist[i] = INF;
        }
        dist[x] = 0;
        queue.add(new int[]{x, 0});

        while (!queue.isEmpty()) {
            int curr[] = queue.poll();
            int u = curr[0];//노드 번호 저장
            if (visited[u]) continue;//만약 방문한적이 있다면 그냥 Pass. -> 우선순위 큐에 따라 이미 최단거리가 저장됐기 때문.

            visited[u] = true;
            for (int v = 0; v < N; v++) {
                if (!visited[v] && graph[v][u] != INF && dist[v] > dist[u] + graph[u][v]) {
                    dist[v] = dist[u] + graph[u][v];
                    queue.add(new int[]{v, dist[v]});
                }
            }

        }


    }
}
