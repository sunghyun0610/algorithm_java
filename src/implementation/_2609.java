package implementation;

import java.util.Scanner;

public class _2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int gcd= Gcd(N, M);
        Lcm(N,M,gcd);
    }

    public static int Gcd(int x, int y) {
        int gcd = 0;
        if (x < y) {
            for (int i = 1; i <= x; i++) {
                if ((x % i == 0) && (y % i) == 0) {
                    gcd = i;
                }
            }
        } else {
            for (int i = 1; i <= y; i++) {
                if ((x % i == 0) && (y % i) == 0) {
                    gcd = i;
                }
            }

        }
        System.out.println(gcd);
        return gcd;
    }

    public static void Lcm(int x, int y,int gcd) {
        System.out.println(x*y/gcd);

    }
}


/*
*     // 유클리드 호제법을 사용한 GCD 계산
    public static int Gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }*/