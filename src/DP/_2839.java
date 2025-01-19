package DP;

import java.util.Scanner;

public class _2839 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int answer=-1;
        int cnt = N/5; //일단 5를 최대로 써서 만들어보기
        for(int i= cnt; i>=0;i--){
            int tmp = N-(i*5);

            if(tmp%3==0){
                answer = i + (tmp/3);
                System.out.println(answer);
                return;
            }
        }

        System.out.println(answer);

    }
//    public static int sum(int num){
//        int result =0;
//        while(num>0){
//            result+=num%10;
//            num/=10;
//        }
//        return result;
//    }
}
