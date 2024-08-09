package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _1012 {

    static int N;
    static int M;
    static int K;
    static int [][] farm;
    static boolean [][] visited;
    static int [] di={-1,1,0,0};//상하
    static int [] dj={0,0,-1,1};//좌우
    static int cnt;

    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int T= Integer.parseInt(st.nextToken());//test case 개수
        for(int c=0;c< T;c++){
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());//가로
            N = Integer.parseInt(st.nextToken());//세로
            K = Integer.parseInt(st.nextToken());//배추의 개수
            farm = new int[N][M];//가로 세로 와 행렬의 행 렬 개념을 잘 동기화해봐
            visited = new boolean[N][M];
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());//x좌표 입력
                int y = Integer.parseInt(st.nextToken());//y좌표 입력
                farm[y][x] = 1;//1로 증가//행렬의 x y 좌표는 반대임 이건 그림 그려보면서 해야댐.
            }
            cnt = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (farm[i][j] == 1 && !visited[i][j]) {//1인 곳만 전체를 돌면서 체크를 하면되니까
                        bfs(i, j);
                        cnt++;//이 흐름의 묶음의 개수를 구하는거니까 여기서 cnt하는구나
                    }
                }
            }
            System.out.println(cnt);
        }
    }


    static void dfs(int i, int j){
        if(farm[i][j]==1 && !visited[i][j]) {
            visited[i][j] = true;//나 여기 서 있음! 방문했음!{
                    for (int k = 0; k < 4; k++) {
                        int nexti= i+di[k];
                        int nextj= j+dj[k];
                        if(nexti>=0&&nexti<N && nextj>=0&&nextj <M && farm[nexti][nextj]==1&&!visited[nexti][nextj]){
                            dfs(nexti,nextj);

                    }
                }
            }
        }

        static void bfs(int i,int j){//1인 좌표들만 오는 중
            visited[i][j]=true;
            Queue<Point> bfs_queue=new LinkedList<>();
            bfs_queue.add(new Point(i,j));
            while(!bfs_queue.isEmpty()){
                Point now= bfs_queue.poll();
                for(int k=0;k<4;k++){
                    int nexti=now.i+di[k];//세로 인덱스
                    int nextj=now.j+dj[k];//가로 인덱스 - M
                    if(nexti>=0&&nexti<N && nextj>=0 && nextj<M && farm[nexti][nextj]==1&&!visited[nexti][nextj]){
                        bfs_queue.add(new Point(nexti,nextj));
                        visited[nexti][nextj]=true;
                    }
                }
            }

        }

       static class Point{
            int i,j;
            Point(int i,int j){
                this.i=i;
                this.j=j;
            }
        }

    }

/*
* 이게왜 그래프로 풀리는 문제인지 알아보는 시간~
*1.인접한 다른 배추로 이동 가능
* 2.상하좌우 네 방향에 다른 배추가 위치한 경우에 서로 인접해 있는 것.
* ->최소 몇마리의 지렁이가 필요한가 -> 서로 인접해있는 배추들이 몇 군데에 퍼져있나
*
* 어떤게 정점? : 한 칸이 정점 new Point(x,y) 총 60개의 정점이있다 예시로 치면 -> 정점이 2차 배열로 표현됨 x좌표 y좌표 dfs(int x, int y)
* 아까 문제는 숫자하나로 정점이 표시되었으므로 dfs(int node)로만 풀 수 있다.
* 어떤게 간선? :
* 내 친구 후보가 4칸(상/하/좌/우)로 제한됨. 즉 갈 수 있는 간선이 최대 4개임
* */