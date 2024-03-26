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
            //Compartor : 인터페이스로 객체를 비교할 수 있도록 만든다. 여기에서는 우선순위 큐에서 요소의 우선순위를 결정하는데 사용되었다.
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
            else if (x==0&&pq.isEmpty()){
                System.out.println("0");
            }
            else {
                System.out.println(pq.poll());

            }
        }
    }
}
//우선순위 큐

/*
* 1.문제 읽기
* 2.주어진 입/출력값 직접 해보며 문제 이해하기
* 3. 어떤 자료구조/알고리즘이 적합한지 생각해보기
* 4. 시간복잡도 고려해서 자료구조/알고리즘 정하기
* N의 최대 범위가 100,000으로 O(nlogn) 시간 복잡도를 가진 알고리즘 선택해야함
* 데이터가 새로 삽입될 때마다 절댓값과 관련된 정렬이 필요하므로, 우선순위 큐로 문제 푼다.
* 단, 절댓값 정렬이 필요하므로 우선순위 큐의 정렬기준을 직접 정의해야함.
* */
