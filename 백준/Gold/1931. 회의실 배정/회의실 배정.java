
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer=0;
        int N = sc.nextInt();
        Meeting [] meeting = new Meeting[N];

        int endTime =0;
        for(int i=0;i<N;i++){
            int x= sc.nextInt();
            int y = sc.nextInt();
            meeting[i]= new Meeting(x,y);
            if(endTime<y){
                endTime=y;//최대 마지막 시간 체크하기
            }
        }
        Comparator<Meeting> cp =new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                if(o1.end==o2.end){
                    return o1.start-o2.start;
                }
                else return o1.end-o2.end;
            }
        };
        //첫번째 매개변수가 기준임.
        //양수 : o1이 더 크다는 의미 : 뒤로감
        //음수 : o1이 더 작다는 의미 : 앞으로감
        Arrays.sort(meeting,cp);
//        for (Meeting k: meeting){
//            System.out.println(k.start);
//        }

        int last=0;

        for(int i=0;i<N;i++){
            int x = meeting[i].start;
            if(last>x){
                continue;//마감시간보다 다음 시작시간이 빠른경우
            }
            int y =meeting[i].end;

            if(x==y){
                answer++;
                last=y;
                continue;
            }
            int next =i+1;
            if(next<N && y==meeting[next].end && meeting[next].start!=meeting[next].end) {
                while (next < N && y == meeting[next].end && meeting[next].start!=meeting[next].end) {
                    next++;
                }
                i = next;//마감시간이 같은 것들은 모두 제외하기
            }
            last=y;
            answer++;
        }
        System.out.println(answer);
    }
    static class Meeting{
        int start;
        int end;
        Meeting(int start,int end){
            this.start=start;
            this.end =end;
        }
    }

}
//회의실 1개
//N개의 회의가 이 하나의 회의실을 사용하려함
//시작~끝나는 시간은 2^31 -1보다 작거나 같은 자연수 또는 0
//사용할 수 있는 회의의 최대 개수
//지금 시점에서 가장 많은 회의가 되도록 하려면? -> 끝나는 시간이 빠른것 부터 해야된다