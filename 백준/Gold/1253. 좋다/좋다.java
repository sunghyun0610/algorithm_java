import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer=0;
        int[] num = new int[N];//10억까지라 int가능?
        for(int i=0;i<N;i++){
            num[i]=sc.nextInt();
        }//입력까지 완료
        Arrays.sort(num);

        for(int i=0;i<N;i++) {
            int start=0;
            int end=N-1;
            while (start < end) {
                int sum = num[start] + num[end];
                if(start==i){
                    start++;
                    continue;
                }
                if(end==i){
                    end--;
                    continue;
                }
                if (sum==num[i]){
                    answer++;
                    break;
                }
                else if(sum<num[i]){
                    start++;
                }
                else if(sum>num[i]){
                    end--;
                }
            }
        }
        System.out.println(answer);
    }
}
//수의 위치가 다르면 다른수로 보므로 set자료형은 안됨
//// 10억+10억 해도 int형 초과되지는 않는다
//그냥 무지성 전체탐색? or 정렬 후 에 이분탐색?
//투 포인터 안되면