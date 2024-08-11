package search.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class _4963 {
    static int[] di={1,-1,0,0,1,1,-1,-1};
    static int[] dj={0,0,1,-1,1,-1,1,-1};
    static int[][]map;
    static boolean[][] visited;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int w=1;
        int h=1;
        while(true){// 0 0이 입력되면 종료
            cnt=0;
            st= new StringTokenizer(br.readLine());
            w=Integer.parseInt(st.nextToken());//너비 == 열
            h= Integer.parseInt(st.nextToken());//높이 == 행 == 가로의 개수
            //일반적으로 map[i][j]에서 i는 행(세로), j는 열(가로)을 나타내야 합니다.
            if((w+h)==0)break;
            map=new int[h][w];
            visited= new boolean[h][w];
            for(int i=0;i<h;i++){//가로 고정하고
                st=new StringTokenizer(br.readLine());
                for(int j=0;j<w;j++){
                    map[i][j]=Integer.parseInt(st.nextToken());//입력 받기
                }
            }//이상 입력받기
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(map[i][j]==1 && !visited[i][j]){
                        dfs(i,j);
                        cnt++;//순회가 한번 끊기면 이게 섬 하나이니까
                    }
                }
            }
            System.out.println(cnt);
        }

    }

    static void dfs(int i,int j){//
        visited[i][j]=true;
        for(int k=0;k<8;k++){
            int nexti=i+di[k];//행간 이동 -> map.length와 관련되겠넹
            int nextj=j+dj[k];//열간 이동을 나타냄
            if(nexti>=0 && nexti<map.length && nextj>=0 && nextj<map[0].length &&map[nexti][nextj]==1&&!visited[nexti][nextj] ){
                dfs(nexti,nextj);
            }
        }
    }
}
