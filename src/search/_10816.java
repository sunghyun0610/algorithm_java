package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int[] num2 = new int[M];
        st = new StringTokenizer(br.readLine());

        for (int j = 0; j < M; j++) {
            num2[j] = Integer.parseInt(st.nextToken());
        }
        int result[] = new int[M];
        Arrays.sort(num);//이진탐색을 위해 정렬까진 완료
        for(int k=0;k<M;k++){
            result[k]+=upperBound(num ,num2[k])-lowerBound(num,num2[k]);
        }

        for (int tmp : result) {
            System.out.print(tmp + " ");
        }
    }

    static int lowerBound(int[] num, int target){
        int lo=0;
        int hi=num.length;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;//mid도 인덱스값이다
            if(num[mid]>=target){
                hi=mid;
            }
            else {//중간값보다 타켓값이 더 큰 경우
                lo=mid+1;
            }
        }
        return lo;

    }

   static int upperBound(int[] num, int target){
        int lo=0;
        int hi=num.length;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(num[mid]>target){
                hi=mid;
            }
            else lo=mid+1;
        }
        return lo;

    }
}
//lower bound : 탐색값기준 처음으로 그 이상의 값을 만난 인덱스를 기억한다
//upper bound : 탐색값기준 처음으로 그 초과된 값을 만난 인덱스를 기억한다. 즉, 탐색값보다 하나 더 증가한 인덱스라고 보면됨.
//중복된 값의 개수는 upper-lower하면 되겠네
//탐색값이 아예 존재하지 않는 경우도 upper-lower=0이 되기에 예외처리 가능하다.
//하한값을 찾는다 -> 중복된 요소들 중 가장 왼쪽값을 찾아야한다. 즉, 왼쪽으로 범위를 좁혀야함-> 상한선을 내리자
//상한값을 찾는다 -> 중복된 요소들 중 가장 오른쪽 +1값을 찾는다. 즉, 오른쪽으로 범위를 좁혀야함 ->하한선을 올리자
//이래서 찾고자하는 값을 찾았을 때 로직이 살짝 다른 것.