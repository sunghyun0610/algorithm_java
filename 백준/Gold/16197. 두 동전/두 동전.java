import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static Character[][] board;
    static boolean [][] visited;
    static int[] dx={-1,1,0,0};
    static int[] dy={0,0,-1,1};
    static int min = Integer.MAX_VALUE;
    static boolean bool =false;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         N = Integer.parseInt(st.nextToken());
         M = Integer.parseInt(st.nextToken());

        board=new Character[N][M];
        visited=new boolean[N][M];
        int x1=0;
        int y1=0;
        int x2=0;
        int y2=0;

        int[][] coin = new int[2][2];
        int idx=0;
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<M;j++){
                char[] ch = str.toCharArray();
                board[i][j]=ch[j];
                if(ch[j]=='o'){
                    coin[idx][0]=i;
                    coin[idx][1]=j;
                    idx++;
                }
            }
        }//입력 완료 -> coint 위치까지 파악완료


        dfs(coin[0][0],coin[0][1], coin[1][0],coin[1][1],0);
        if(bool){
            System.out.println(min);
        }
        else {
            System.out.println(-1);
        }

    }
    static void dfs(int x1,int y1,int x2, int y2, int cnt){
        if(cnt>10){
            return;
        }
        if(x1<0 || x1>=N || y1<0 || y1>=M){
            if(x2<0 || x2>=N || y2<0 || y2>=M){
                return;
            }
            min=Math.min(min,cnt);
            bool=true;
            return;
        }
        if(x2<0 || x2>=N || y2<0 || y2>=M){
            if(x1<0 || x1>=N || y1<0 || y1>=M){
                return;
            }
            min=Math.min(min,cnt);
            bool=true;
            return;
        }


        for(int i=0;i<4;i++){
            int next_x1= x1+dx[i];
            int next_y1 = y1+dy[i];
            int next_x2= x2+dx[i];
            int next_y2 = y2 + dy[i];

            if(next_x1>=0 && next_x1<N && next_y1>=0 && next_y1<M &&next_x2>=0 && next_x2<N && next_y2>=0 && next_y2<M  ) {

                if (board[next_x1][next_y1] == '#') {
                    next_x1 = x1;
                    next_y1 = y1;
                }
                if (board[next_x2][next_y2] == '#') {
                    next_x2 = x2;
                    next_y2 = y2;
                }
                dfs(next_x1,next_y1,next_x2,next_y2, cnt+1);
            }else {

                dfs(next_x1,next_y1,next_x2,next_y2, cnt+1);

            }



        }

    }
}
//칸 비어져있거나 벽.
// 두개의 빈 칸에 동전이 하나씩 있다
//동전이 이동하려는 방향에 칸이 없으면 동전은 보드 바깥으로 떨어진다.
//버튼을 10번보다 많이 눌러야한다면 -1 출력
