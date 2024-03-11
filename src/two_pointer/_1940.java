package two_pointer;

import java.util.Arrays;
import java.util.Scanner;

public class _1940 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//재료 개수
        int M = sc.nextInt();//갑옷 만드는데 필요한 수
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();

        }
        Arrays.sort(num);//오름차순 정렬!
        int start_index=0;
        int end_index=N-1;
        int cnt=0;
        int sum=0;
        while(start_index<end_index){
            if(num[start_index] + num[end_index]==M){
                cnt++; start_index++; end_index--;
            }
            else if(num[start_index] + num[end_index]>M){
                end_index--;
            }
            else {
                start_index++;
            }
        }

        System.out.println(cnt);
    }
}

//오름차순 정렬하고 풀면 쉽다!