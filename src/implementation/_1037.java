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
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);
        int result=0;
        if(N==1){
            result=num[0]*num[0];
        }
        else {
            result=num[0]*num[N-1];
        }
        System.out.println(result);
    }
}
