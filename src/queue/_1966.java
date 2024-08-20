package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1966 {
    static Queue<Integer> queue;
    static Queue<Integer> queue_idx;
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int T= Integer.parseInt(st.nextToken());
        for(int i=0;i<T;i++){
            st=new StringTokenizer(br.readLine());
            N=Integer.parseInt(st.nextToken());
            M=Integer.parseInt(st.nextToken());
            queue=new LinkedList<>();//우선순위
            queue_idx=new LinkedList<>();
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                queue.add(Integer.parseInt(st.nextToken()));
                queue_idx.add(j);
            }
            solution();
        }
    }

    private static void solution() {
        int cnt=0;
        while(!queue.isEmpty()){
            int max=Collections.max(queue);
            int first=queue.poll();//값  꺼내면서 저장하는 거니까
            int cur=queue_idx.poll();
            if(max==first){
                cnt++;
                if(cur==M){
                    System.out.println(cnt);
                    break;
                }
            }
            else{
                queue.add(first);
                queue_idx.add(cur);
            }
        }
    }
}
//문제를 정확히 이해하고 풀어야한다. 침착하자. 그냥 머릿속으로 이해했다고 생각하고 넘어가지 말자.
//여기서도 우선순위가 제일 높은게 0번째로와야지 뽑히는데 그걸 캐치못해서 삽질했다 아이가!
//네, 가능합니다. static으로 선언된 클래스 변수에 대해 여러 번 new를 통해 새 객체를 할당해도 문제가 없습니다.
// 여기서 중요한 점은 static 변수가 모든 인스턴스에서 공유된다는 점이지만,
// new 키워드를 사용해 새로 할당할 때마다 이전 객체 참조는 사라지고, 새롭게 할당된 객체를 참조하게 됩니다.