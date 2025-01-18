package DP;

import java.util.Scanner;

public class _9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T =sc.nextInt();

        int [] num = new int[11];//1~10까지 숫자 중 1,2,3합으로 숫자 나타내지는 방법 수를 저장하는 배열
        num[1]=1;
        num[2]=2;
        num[3]=4;
        for(int i=0; i<T;i++){
            int n =sc.nextInt();// 주어진 숫자
            int cnt =0;// 1,2,3합으로 숫자 나타내는 방법의 수
            for(int k=1;k<=n;k++){
                if(k>3){
                    num[k] = num[k-1] + num[k-2] + num[k-3];
                }
            }
            System.out.println(num[n]);
        }
    }
}
