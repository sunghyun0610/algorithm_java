package implementation;

import java.util.Scanner;

public class _14502 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int [][] map= new int[N][M];//세로 N = 열
        for(int i=0; i<N;i++){
            for(int j=0;j<M;j++){
                map[i][j]=sc.nextInt();
            }
        }
//        for(int [] check : map){
//            for( int num : check){
//                System.out.print(num + " ");
//            }
//            System.out.println();
//        } 2차원 배열 출력

        int wall=0;//벽 카운트 , 벽을 어느 기준으로 세워야댐?
        //2를 다 가둘 수 있는 경우
        //2를 못가두는 경우
        //안전지대 기준 : 배열 끝부분 만나거나 or 1로 둘러 쌓여있는 0의 개수

    }
}
