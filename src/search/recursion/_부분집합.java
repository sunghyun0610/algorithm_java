package search.recursion;

import java.util.Arrays;

//뽑는 개수가 정해져있지 않음.
public class _부분집합 {
    static int N=3;
    static String[] cards = {"A","B","C"}; // 순열의 재료가 되는 대상(뽑히는 애들)

    static boolean [] used = new boolean[N];


    public static void main(String[] args) {
        subset(0);
    }
    static void subset(int idx){
        if (idx == N) {
            System.out.println(Arrays.toString(used));
            return;
        }

        used[idx]=true;
        subset(idx+1);
        used[idx]=false;
        subset(idx+1);
    }
}
