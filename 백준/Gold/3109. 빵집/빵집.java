import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] dx ={-1,0,1};//x가 커질수록 아래로 이동하니까
    static int[] dy ={1,1,1}; //y가 커질수록 가로로 이동하니까
    static Character[][] map;
    static boolean[][] visited;
    static int answer=0;
    static int C;
    static int R;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         R = sc.nextInt();
         C = sc.nextInt();
        map=new Character[R][C];
        visited = new boolean[R][C];
        for(int i=0;i<R;i++){
            String str = sc.next();
            for(int j=0;j<C;j++){
                map[i][j] = str.charAt(j);
            }
        }
        for(int i=0;i<R;i++){
            if(dfs(i,0)){
                answer++;
            };
        }
        System.out.println(answer);
    }
    static boolean dfs(int x, int y){
        visited[x][y]=true;
        while(y==C-1){
            return true;
        }
        for(int i=0;i<3;i++){
            int next_x = x+dx[i];
            int next_y = y+dy[i];
            if(next_x>=0 && next_x<R && next_y<C && map[next_x][next_y]=='.'&& !visited[next_x][next_y]){
                if(dfs(next_x,next_y)){
                    return true;
                }
            }
        }
        return false;

    }

}
//첫쨰열 (세로) 근처 빵집 가스관
//마지막 열 == 원웅이 빵집
//가스관과 빵집을 연결한든 모든 파이프라인은 첫째열에서 시작 ~ 마지막열에서 끝나야함
//각 칸은 오른쪽, 오른쪽위 대각선, 오른쪽 아래 대각선 연결가능
//파이프 라인 최대 개수는?
//영웅이네 빵집에서 ~ 가스관으로 거꾸로 가야할듯?