import java.io.*;
import java.util.*;
public class Main {
    static int[][] world;
    static boolean[][] visited;
    static int N,L,R;
    static int[] dx={-1,1,0,0};
    static int[] dy={0,0,-1,1};
    static int days =0;
    public static void main(String [] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        world = new int[N][N];
        for(int i=0;i<N;i++){
            st= new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                world[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        while (true){
            boolean isMoved = false;//인구 이동이 일어 났는가?
            visited= new boolean[N][N];
            //전체 격자에 대해 연합 형성 시도
            for(int i=0;i<N;i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j]) {
                        List<int[]> union = new ArrayList<>();
                        int sum = bfs(i,j,union);
                        //연합 크기가 2 이상이면 인구 이동 발생
                        if(union.size()>1){
                            int newPopulation = sum/union.size();
                            for(int[] pos : union){
                                world[pos[0]][pos[1]] = newPopulation;
                            }
                            isMoved = true;
                        }
                    }
                }
            }
            if(!isMoved) break;
            days++;
        }
        System.out.println(days);




    }
    static int bfs(int x,int y, List<int[]> union){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x,y});
        union.add(new int[] {x,y});
        int sum=world[x][y];
        while(!queue.isEmpty()){
            int[] tmp= queue.poll();
            int i= tmp[0];
            int j =tmp[1];
            visited[i][j]=true;
            for(int k=0;k<4;k++){
                int nx = i+dx[k];
                int ny = j+dy[k];
                if(nx>=0 && nx<N && ny>=0 && ny<N &&!visited[nx][ny]){
                    int diff = Math.abs(world[i][j]-world[nx][ny]);
                    if(diff>=L && diff<=R){
                        union.add(new int[]{nx,ny});
                        queue.add(new int[]{nx,ny});
                        visited[nx][ny]=true;
                        sum+=world[nx][ny];
                    }
                }
            }
        }
        return sum;
    }



}

//국경선을 공유하는 두 나라의 인구차이 L이상 R이하라면 국경선을 오늘 하루 연다
//열어야하는 국경선이 모두 열렸다면 인구 이동을 시작한다!
//국경선 열려있고 인접한 칸만을 이용해 이동 가능하며, 그 나라를 오늘 하루동안은 연합이라고 한다
//연합을 이루고 있는 각 칸의 인구수는 (연합 인구수)/(연합을 이루고 있는 칸의 개수)가 된다. 소수점은 버린다
//연합을 해체하고 모든 국경선을 닫는다
//너무 쫄지말고 변수명을 직관적이게 잘 지어보자. 그러면 로직짜는데 쉬워지더라.