package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2750 {
    public static void main(String [] args)throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));//InputStreamReader : 바이트 기반 입력 스트림-> 문자 기반 입력 스트림으로 변환
        int N =Integer.parseInt(bf.readLine());
        int [] num=new int[N];
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(bf.readLine());
        }
        Arrays.sort(num);// dual-pivot Quicksort알고리즘 사용됨.
        for(int j : num){
            System.out.println(j);
        }
    }
}
