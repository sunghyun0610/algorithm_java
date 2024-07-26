package search.recursion;

import java.util.Arrays;

public class _조합 {
    static int N=5, R= 3;
    static String[] cards = {"A","B","C","D","E"}; // 조합의 재료가 되는 대상(뽑히는 애들)


    static int idx=0;//몇개 뽑았는지는 알아야하니

    static boolean[] used=new boolean[N];

    static String[]result=new String[R];


    public static void main(String[] args) {
         comb(0,0);
    }

    static void comb(int cnt,int idx){//cnt가 뽑힌 개수, idx가 문자카드 인덱스
        if(cnt==R){
            System.out.println(Arrays.toString(used));
            return;//R개 만큼 뽑았으면 그만뽑아야지.
        }
        if(idx==N){
            return;
        }

        used[idx]=true;//카드 뽑고
        comb(cnt+1,idx+1);//카드 뽑고 기다릴게.
        used[idx]=false;//이번에는 그 카드 빼고 조합 만들어봐쟈
        comb(cnt,idx+1);

    }
}
