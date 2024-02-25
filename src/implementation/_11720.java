package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class _11720 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();//숫자 개수 입력받기
        String str=sc.next();
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=str.charAt(i)-'0';// 범위가 변수>리터럴인경우 자동 형변환 가능.
        }
        System.out.println(sum);
    }
}

//아스키 코드 : 문자 1과 숫자 1이 48의 차이가 난다. 즉 문자 1을 숫자 1로 출력하려면 '1'-48해야함.