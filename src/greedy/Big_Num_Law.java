package greedy;

import java.util.Scanner;

public class Big_Num_Law {
    public static void main(String[] args){
        int N,M,K;
        Scanner sc= new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        K=sc.nextInt();
        int[]num= new int[N];//배열 선언법 기억!
        for(int i=0; i<N;i++){
            num[i]=sc.nextInt();

        }// 결국 가장 큰수, 두번째로 큰수 만 알면됨.
        int max=0;
        int max_2=0;
        for(int j=0;j<N; j++){
            if(max<num[j]){
                max=num[j];//큰수는 정수
                continue;
            }
            if(max==num[j]){
                max_2=num[j];//최대값 구함
            }

        }
        if(max!=max_2){
            for(int k=0;k<N;k++){
                if(max_2<num[k] && max>num[k]){
                    max_2=num[k];//2째 큰수 구함!
                }
            }
        }
        int cnt=0;
        int result =0;
        for(int i=0;i<M;i++){//M번 덧셈연산

            if(cnt==K){
                result+=max_2;
                cnt=0;
            }
            else {
                result+=max;
                cnt++;
            }

        }
        System.out.println(result);

    }

}
//큰수와 2번째 큰수를 찾을때 배열을 오름차순 정리해서 맨에서 첫번쨰 두번째 수를 가져오는 방법!!

/*
*package exam03_greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2_HighNumber{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 배열의 크기
        int m = Integer.parseInt(st.nextToken()); // 숫자가 더해지는 횟수
        int k = Integer.parseInt(st.nextToken()); // 연속해서 더할 횟수

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        // 배열 입력
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 배열 오름차순 정렬
        int first = arr[arr.length-1]; // 가장 큰 수
        int second = arr[arr.length-2]; // 두번째로 큰 수
        int result = 0;

        // while문으로 m번 만큼 반복
        while (m != 0) {
            // 가장 큰 수 k번 더함
            for (int j = 0; j < k; j++) {
                result += first;
                m--; // 횟수 차감
            }
            // 두번째로 큰 수 한 번 더함
            result += second;
            m--; // 횟수 차감
        }

        bw.write(result+"\n");

        br.close();
        bw.close();

    }
}
*
*
* */
