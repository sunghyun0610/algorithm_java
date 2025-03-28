import java.util.*;

public class Main {
    static int time=Integer.MAX_VALUE;
    static int[] visited;
    static int[] dx = {0,-1,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        visited = new int[2000001];
        Arrays.fill(visited,-1);
        bfs(N,K);
        System.out.println(visited[K]);
    }
    static void bfs(int x,int y){
        Deque<Integer> queue = new LinkedList<>();
        queue.add(x);
        visited[x]=0;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            //System.out.println(curr);
            if(curr==y) return;
            for(int i=0;i<3;i++){
                int nx = 0;
                if(i==0){
                    nx=curr*2;
                    if(nx<2000001 && visited[nx]==-1) {
                        queue.addFirst(nx);
                        visited[nx] = visited[curr];
                    }
                }
                else{
                    nx=curr+dx[i];
                    if(nx>=0 && nx<2000001 && visited[nx]==-1) {
                        queue.addLast(nx);
                        visited[nx] = visited[curr]+1;
                    }

                }

            }
        }
    }


}
//결국 앞으로 걷기 or 뒤로 걷기 or  순간이동 -> 3가지 선택
//dfs로하면 터질듯
//이거 그리디? 근데 선택에 영향을 받는데?
//bfs -> 시간 계산하기 애매하지 않나
