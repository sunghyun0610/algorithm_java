package two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class _2018 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int cnt=1;
        int start_index=1;
        int end_index=1;
        int sum=1;
        while(end_index!=N){
            if (sum == N) {
                cnt++; end_index++; sum+=end_index;
            }
            else if(sum>N){
                sum-=start_index;
                start_index++;

            }
            else{
                end_index++; sum+=end_index;
            }
        }
        System.out.println(cnt);
    }
}


/*
* import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;

        for(int i=1; i<=n; i++){
            int sum = 0;
            for(int j=i; j<=n; j++){
                sum+=j;
                if(sum >n) break;
                else if(sum == n){
                    answer++;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
* */