package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());//시험본 과목 개수 입력
        double [] score=new double[N];
        double max=0;
        StringTokenizer st= new StringTokenizer(br.readLine()," ");//입력 받은 문자열을 공백으로 구분하겠다.
        for(int i=0;i<N;i++){
            score[i]=Double.parseDouble(st.nextToken());
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
