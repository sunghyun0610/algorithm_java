package sorting;

import java.util.*;

public class _1026 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N =sc.nextInt();
        int[] A=new int[N];
        int[] B=new int[N];
//        int[] A2=new int[N];//재배열한 A배열
//        int[] B_idx=new int[N];//인덱스 기준 크기 정렬
        int sum=0;
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());//최댓값부터 뽑혀 나오게
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            B[i]=sc.nextInt();
            queue.add(B[i]);//B원소를 우선순위큐에 넣음
        }

        Arrays.sort(A);//A 내림차순해야지 B의 최댓값과 A의 최솟값이 곱해지겠네

        for(int j=0;j<N;j++){
            sum+=A[j]* queue.remove();
        }

        System.out.println(sum);
    }
}


//최소가 될라면 B의 최대값이 A의 최솟값과 곱해져야댐.
//B가 우선순위 큐를 이용하 크기순으로 뽑혀 나올듯