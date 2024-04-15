package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _11650 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int [][] dot=new int[N][2];
        for(int i=0;i<N;i++){
            dot[i][0]=sc.nextInt();//x좌표
            dot[i][1]=sc.nextInt();//y좌 표
        }
//        for(int [] i : dot){//i는 한행에 해당하는 배열을 받는다
//            System.out.println(i[0]+" "+i[1]);
//        } 2차원 배열 출력 알아두자!

        Arrays.sort(dot, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]){
                    //return Integer.compare(o1[1],o2[1]);
                    return o1[1]-o2[1];
                }
                else{
                    return Integer.compare(o1[0],o2[0]);
                }
            }
        });

        for(int[] k : dot){
            System.out.println(k[0]+" "+ k[1]);
        }
    }
}
