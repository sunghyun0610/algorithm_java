package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class _1546 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();//시험본 과목 개수 입력
        double [] score=new double[N];
        double max=0;
        for(int i=0;i<N;i++){
            score[i]=sc.nextInt();
            if(max<score[i])
                max=score[i];// 최대값 확인
        }
        //System.out.println(Arrays.toString(score)); 점수 입력 테스트케이스
        double sum=0;
        double average=0.0;
        for(int j=0; j<N; j++){
            score[j]=score[j]/max*100;
            sum+=score[j];
        }
        average=sum/N;
        System.out.println(average);

    }
}
