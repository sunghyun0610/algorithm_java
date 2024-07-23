package swea;

import java.util.ArrayList;
import java.util.Scanner;


public class _5215 {
    static int [] score;
    static int [] calories;
    static int totalKcal;
    static int highScore;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();

        int max=0;

        for(int i=1;i<=T;i++){
            N=sc.nextInt();//재료의 수
            totalKcal=sc.nextInt();//제한 칼로리
            score=new int[N];
            calories=new int[N];

            for(int j=0;j<N;j++){
                score[j]=sc.nextInt();
                calories[j]=sc.nextInt();
            }
            highScore=0;
            cb(0,0,0);
            System.out.println("#"+i+" "+highScore);

        }

    }

    public static void cb(int num, int sumScore, int sumKcal){
        if(sumKcal <=totalKcal)highScore=Math.max(highScore,sumScore);
        if(sumKcal>totalKcal) return;
        if(num==N) return;

        cb(num+1,sumScore+score[num],sumKcal+calories[num]);//n번째 재료 선택한 경우
        cb(num+1,sumScore,sumKcal);//n번째 재료 선택 안했을 경우
    }
}
//원하는 조합으로 햄버거를 만들어서 준다.
//햄버거 재료에대한 점수/ 가게에서 제공하는 재료에 대한 칼로리가 주어짐.
//정해진 칼로리 이하의 조합 중에서 민기가 가장 선호하는 햄버거를 조합해주는 프로그램을 만들어보자.
//점수가 높다고 칼로리가 높은것도 아님.
//맛을 기준으로 정렬해야함.