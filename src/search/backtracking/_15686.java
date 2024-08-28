package search.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class _15686 {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] di={-1,1,0,0};
    static int[] dy={0,0,-1,1};
    static int min= Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());//지도 크기
        M = Integer.parseInt(st.nextToken());// 치킨집 개수
        map=new int[N+1][N+1];//좌표가 1,1 부터 시작하기 때문
        visited=new boolean[N+1][N+1];
        for (int i=1;i<N+1;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1;j<N+1;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }//집 , 치킨집 위치 입력 완료
        //일단 모든 집들을 브루트포스로 탐색해야댐.
        for(int i=1;i<N+1;i++){
            for(int j=1;j<N+1;j++){
                if(map[i][j]==1){
                    dfs(i,j,0);
                }
            }
        }//어차피 집위치는 고정되어있음

    }

    public static void dfs(int x, int y, int cnt){
        if(cnt==M){
            return;
        }
        for(int i=0;i<4;i++){
            int nextx=x+di[i];
            int nexty=y+dy[i];
            if(nextx>=0 && nextx<N+1&& nexty>=0 && nexty<N+1&& map[nextx][nexty]==2 && !visited[nextx][nexty]){
                visited[nextx][nexty]=true;
                int dis= Math.abs(x-nextx)+Math.abs(y-nexty);
                dfs(nextx,nexty,cnt+1);
                visited[nextx][nexty]=false;
            }
        }
    }

}
