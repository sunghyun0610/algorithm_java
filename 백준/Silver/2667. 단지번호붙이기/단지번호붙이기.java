

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static int cnt;//총 단지수
    static int cntHouse;//단지내 집의 수
    static int[][] map;
    static boolean [][] visited;
    static int N;
    static List<Integer> houses;

    static int []di={1,-1,0,0};
    static int []dj={0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());//정사각형 크기
        map=new int[N][N];
        visited= new boolean[N][N];
        for(int i=0;i<N;i++){
            String str=br.readLine();
            for(int j=0;j<N;j++){
                map[i][j]=Character.getNumericValue(str.charAt(j));
            }
        }//이상 입력 완료!
        houses=new ArrayList<>();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(map[i][j]==1 && !visited[i][j]){
                    cntHouse=0;
                    dfs(i,j);
                    cnt++;//총 단지수는 여기서 증가
                    houses.add(cntHouse);
                }
            }
        }
        Collections.sort(houses);
        System.out.println(cnt);
        for(int result : houses){
            System.out.println(result);
        }
    }
    static void dfs(int i,int j){
        visited[i][j]=true;
        cntHouse++;
        for(int k=0;k<4;k++){
            int nexti=i+di[k];
            int nextj=j+dj[k];
            if(nexti>=0 && nexti<N && nextj>=0 && nextj<N && map[nexti][nextj]==1 && !visited[nexti][nextj]){
                dfs(nexti,nextj);

            }
        }
    }
}
