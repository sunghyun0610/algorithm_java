package implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
//        int[] result = new int[N];
        boolean [] visited = new boolean[N];
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<N;i++){
            list.add(i+1);
        }//list에 1~N까지 입력받기, 인데스 0->1
        int idx=0;
        System.out.print("<");
        while(!list.isEmpty()){

            int cnt=1;//몇번째 자리인지 카운트하기, 매번 초기화
            while(cnt!=K){
                cnt++;
                idx++;
                if(idx>=list.size()){
                    idx=0;
                }
            }
            int T=list.get(idx);
            if(list.size()==1){
                System.out.print(list.get(idx));
            }
            else {
                System.out.print(list.get(idx)+", ");
            }
            list.remove(idx);
            if(idx>=list.size()){
                idx=0;
            }
        }

        System.out.print(">");



//        System.out.print("<");
//        for(int k :result){
//            System.out.print(k+", ");
//        }
//        System.out.print(">");
//    }
    }
}
//리스트는 제거하면 알아서 인덱스 앞으로 떙겨주네