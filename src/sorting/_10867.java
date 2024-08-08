package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N= Integer.parseInt(st.nextToken());
        int [] num=new int[N];
        st=new StringTokenizer(br.readLine());//초기화
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);
        for(int j=0;j<N;j++){
            if(j!=0){
                if(num[j-1]==num[j]){
                }
                else {
                    System.out.print(num[j]+" ");
                }
            }
            else System.out.print(num[j]+" ");
        }

    }
}
