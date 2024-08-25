package search.backtracking;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _15649 {

    static int N, M;
    static boolean[] visied;
    static int[] num;
    static StringBuilder sb= new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());//자연수 범위
        M = Integer.parseInt(st.nextToken());//수열 개수
        visied=new boolean[N+1];
        num=new int[M];
        makeArray(0);
        System.out.println(sb);

    }
    public static void makeArray(int cnt){
        if(cnt==M){
            for(int i=0;i<M;i++){
                sb.append(num[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=1;i<=N;i++){
            if(visied[i]) continue;//방문했으면 다음으로 진핼!-> 이게 중요
            visied[i]=true;
            num[cnt]=i;
            makeArray(cnt+1);
            visied[i]=false;
        }
    }



}
