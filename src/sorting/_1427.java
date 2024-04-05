package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _1427 {

    public static int[] bubble_sort(int [] num){//static으로 선언한 이유 : 객체를 생성하지 않고도 접근할 수 있게 해야하기 때문. iv를 사용하지 않음.
        int tmp=0;

        for(int i=0;i<num.length-1;i++){//인접한 수끼리 비교하며 정렬을 배열의 길이 -1만큼 반복
            for(int j=0;j<num.length-i-1;j++){//인접한 수 끼리 비교하며 정렬
                if(num[j]<num[j+1]){
                    tmp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=tmp;
                }
            }
        }
        return num;//Java에서 배열은 참조 타입이므로 num 배열 자체가 정렬되며 별도로 복사됨. (주소가 저장됨)
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int []num=new int[str.length()];
        for (int i=0;i<str.length();i++){
            num[i]=Character.getNumericValue(str.charAt(i));// Character,getNumericValue : 단일문자 정수 변환
        }
        bubble_sort(num);
        for(int k : num){
            System.out.print(k);
        }

        //배열 입력까지 받았다.
    }



}
