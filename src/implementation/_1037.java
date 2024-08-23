package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1037 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());//진짜 약수의 개수
        int []num=new int[N];
        int result=0;
        int max=0;
        int min=Integer.MAX_VALUE;
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(st.nextToken());
            max=Math.max(max,num[i]);
            min=Math.min(min,num[i]);
        }
        result=max*min;

        System.out.println(result);
    }
}
// 배열 최대값 구할 때 Math.max도 활용해보자!
