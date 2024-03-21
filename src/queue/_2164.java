package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2164 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        //제일 위에서 하나빼고=dequeue(앞에서 삭제), 제일 뒤로 보내기=enqueue(뒤에 삽입) : 즉, 큐 자료구조를 이해하냐는 질문
        Queue<Integer> queue= new LinkedList<>();
        for(int i=0;i<N;i++){
            queue.add(i+1);
        }
        while(queue.size()>1){
            queue.poll();//맨위의 값 반환 후 삭제
            queue.add(queue.poll());//맨 위의값 삭제후 그 값 다시 추가
        }
        int result=queue.peek();
        System.out.println(result);
    }

}
