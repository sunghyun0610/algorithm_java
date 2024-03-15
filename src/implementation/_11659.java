package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11659 {
    public static void main(String [] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));// bufferedReader 객체 선언
        StringTokenizer st = new StringTokenizer(br.readLine());//공백으로 구분된 여러 데이터를 한 줄에서 "입력"받을 때 사용
        int N = Integer.parseInt(st.nextToken()); // 사용자로부터 입력받은수의 개수 읽어서 변수 N에다 대입연산하기.
        int M = Integer.parseInt(st.nextToken()); // 몇 번 합해야 하는지 횟수
        st = new StringTokenizer(br.readLine()); // 숫자들 입력받기 위해 새로운 줄 읽야함.
        int [] num= new int[N];
        int [] sum= new int[N+1];
        sum[0]=0;
        int tmp=0;
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(st.nextToken());//숫자들 입력받기
            tmp+=num[i];
            sum[i+1]=tmp;
        }
        for(int k=0; k<M; k++){
            st=new StringTokenizer(br.readLine());
            int i= Integer.parseInt(st.nextToken());
            int j=Integer.parseInt(st.nextToken());
            System.out.println(sum[j]-sum[i-1]);
        }



    }
}
