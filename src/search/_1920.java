package search;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class _1920 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] num1=new int[N];
        for(int i=0;i<N;i++){
            num1[i]=sc.nextInt();
        }
        Arrays.sort(num1);//정렬되어야지 이진탐색 가능
        int M=sc.nextInt();
        int[] num2=new int[M];
        for(int i=0;i<M;i++){
            num2[i]=sc.nextInt();
        }//M만큼의 num2 수들이 num1 에 포합되어있냐 여부 체크하기

        for(int i=0;i<M;i++){
            binarySearch(num1,num2[i]);
        }

    }

    static void binarySearch(int[] num,int target){
        int start=0;
        int end=num.length-1;
        int mid=0;
        while (start <= end){
            mid=start+(end-start)/2;
            if(num[mid]<target){
                start=mid+1;
            }
            else if(num[mid]==target){
                System.out.println("1");
                return;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println("0");
        return;

    }
}
//최대 입력이 100000개 ->2중 for문은 시간초과 위험. ->이진 탐색으로 가야하나?