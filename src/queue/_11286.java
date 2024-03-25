package queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _11286 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//연산의 개수
        //절댓값 힙 : x!=0이면 배열에 삽입, x==0이면 절댓값이 가장 작은 수 출력 후 제거.

        PriorityQueue<Integer> pq= new PriorityQueue<>(new Comparator<Integer>() {
            //Compartor : 우선순위 큐에서 요소의 우선순위를 결정하는데 사용.
            @Override
            public int compare(Integer a, Integer b) {
                if(Math.abs(a)==Math.abs(b)) {
                    return Integer.compare(a,b);//comparator 인터페이스 구현할 때 compare 메서드 사용
                                    }
                return Integer.compare(Math.abs(a),Math.abs(b));

            }
        });
        for(int i=0;i<N;i++){
            int x=sc.nextInt();
            if(x!=0){
                pq.offer(x);//x가 0이 아니라면 배열에 x 값 추가
            }
            else if (pq.isEmpty()){
                System.out.println("0");
            }
        }
    }
}
