

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//전체 날짜 수
        int K = sc.nextInt();//합을 구하기위한 연속적인 날짜
        int maxTem =0;

        int[] tem = new int[N];
        for(int i=0;i<N;i++){
            tem[i] = sc.nextInt();
        }//온도 입력받기 완료
        for(int i=0; i<K;i++){
            maxTem += tem[i];
        }
        int last=maxTem;
        for(int i=0;i<N-K;i++){
          int tmp = last-tem[i] +tem[i+K];
          last=tmp;

          if(tmp>maxTem) maxTem=tmp;
        }
        System.out.println(maxTem);


    }
}//연속적으로 며칠동안 온도의 합이 가장 큰 값을 계산하는 프로그램
//어차피 몇개를 해도 처음 마지막만 차이나는거임
//부분순열 크기 고정 -> 슬라이딩 윈도우
