package DP;

import java.util.Scanner;

public class _2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for(int i=0; i<T; i++){
            int k = sc.nextInt();//k층수
            int n = sc.nextInt();// n호수
            int[][] num = new int[k+1][n+1];
            for(int a=0; a<=k;a++){
                for(int b=1; b<=n;b++){
                    if(a>0 && b>1){
                        num[a][b] = num[a][b-1] + num[a-1][b];
                    }
                    else if(a==0){
                        num[a][b] = b;
                    }
                    else if(b==1){
                        num[a][b]=1;
                    }
                }
            }
            System.out.println(num[k][n]);
        }


    }
}
//거주 조건 : a층 b호에 살려면 a-1층의 1~b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다
//아파트는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
