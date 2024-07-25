package search.recursion;

import java.util.Arrays;

public class _순열 {
    static int N=5, R= 3;
    static String[] cards = {"A","B","C","D","E"}; // 순열의 재료가 되는 대상(뽑히는 애들)

    static boolean [] visited = new boolean[N];//5개 문자중 뽑혔냐 여부를 알아야 하기 때문

   static String [] result= new String[R];//  N개중에 R개를 뽑아서 순서까지 고려해서 채워놓을 배열

    public static void main(String[] args) {
        perm(0);
    }

    static void perm(int cnt){
        if(cnt==R){
            System.out.println(Arrays.toString(result));
            return;//R개만큼 다 뽑았으면 돌아가야지
        }
        for(int i=0; i<N; i++){
            if(visited[i]) continue;//쓴 문자라면 넘겨야지

            visited[i] =true;//// 먼저 호출된 재귀가 안쓰는 카드네?내가 맡은자리 idx에다 i번 카드를 써볼게요
            result[cnt]=cards[i];//// i번 카드 내가 쓰고있다고 내 다음 재귀들한테 알려야 해요!
            perm(cnt+1);// 자 이제 얘가 스택에서 나갈때까지 나는 이 아래 문장 실행 안하고 계속 기다림!!!!!
            visited[i]=false;
        }

    }

}
