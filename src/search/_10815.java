package search;

import java.util.Arrays;
import java.util.Scanner;

public class _10815 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int []num=new int[N];
        for(int i=0;i<N;i++){
            num[i]=sc.nextInt();
        }
        int M=sc.nextInt();
        Arrays.sort(num);//정렬이 되어야 이분탐색이 된다.
        int[] num2=new int[M];
        for(int i=0;i<M;i++){
            num2[i]=sc.nextInt();
        }
        for(int j=0;j<M;j++){
            if(Arrays.binarySearch(num,num2[j])>=0){//양수,0를 반환하면 있다는 것. 없으면 음수를 반환
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }

    }
}
/*
* 1.탐색문제이다
* 2.카드개수 50만 적힌수 -1천만~천만
* N^2하면 안될듯 ->binarySearch이용해볼까
* */
