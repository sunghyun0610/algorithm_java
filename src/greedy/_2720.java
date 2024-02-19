package greedy;

import java.util.Scanner;

public class _2720 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T= sc.nextInt();// 테스트 케이스 입력받기
        int[] pay=new int[T];

        for(int i=0; i<T; i++){
            pay[i]=sc.nextInt();//거스름돈 입력 받기
        }
        for(int j=0; j<T; j++){
            System.out.print(pay[j]/25 + " ");
            pay[j]%=25;
            System.out.print(pay[j]/10+ " ");
            pay[j]%=10;
            System.out.print(pay[j]/5+ " ");
            pay[j]%=5;
            System.out.print(pay[j]);
            System.out.println();

        }
    }
}
