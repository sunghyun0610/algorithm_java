package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//버블 정렬로 풀어봄
public class _2750 {
    public static void main(String [] args)throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));//InputStreamReader : 바이트 기반 입력 스트림-> 문자 기반 입력 스트림으로 변환
        int N =Integer.parseInt(bf.readLine());
        int [] num=new int[N];
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(bf.readLine());
        }//입력 완료
        int tmp=0;
        for(int j=0; j<N-1;j++){//loop의 개수
            for(int k=0;k<N-j-1;k++){//정렬하는 범위
                if(num[k]>num[k+1]) {//k+1이므로 인덱스 값 N-1해야댐. 안그러면 배열 인덱스 범위 초과
                    tmp = num[k];
                    num[k] = num[k + 1];
                    num[k + 1] = tmp;//큰수가 뒤로
            }
            }
        }

//        Arrays.sort(num);// dual-pivot Quicksort알고리즘 사용됨.
        for(int j : num){
            System.out.println(j);
        }
    }
}
