import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();// 리스트에 있는 점수 개수
        int newScore = sc.nextInt();// 새로운 점수 20억이하이므로 int가능
        int P = sc.nextInt();//랭킹 리스트에 올라 갈 수 있는 점수 개수

        if(N==0){
            System.out.println(1);
            return;
        }

        List<Integer> nowScore = new ArrayList<>();
        for(int i=0;i<N;i++){
            int score = sc.nextInt();
            nowScore.add(score);
        }//현재 리스트 점수 입력 완료
        Collections.sort(nowScore,Collections.reverseOrder());//내림차순 정렬

        if(P==N){
            if(newScore<=nowScore.get(N-1)){
                System.out.println(-1);
                return;
            }
            else{
                int idx=0;
                while( idx<N && newScore<nowScore.get(idx)){
                    idx++;
                }
                System.out.println(idx+1);
            }
        }
        else {//빈자리가 있는경우
            int idx=0;
            while( idx<N && newScore<nowScore.get(idx)){
                idx++;
            }
            System.out.println(idx+1);
        }



    }
}
//각 노래마다 랭킹 리스트 존재
//랭킹 리스트가 꽉 차있을때, 새점수가 이전 점수보다 더 좋을 때만 점수가 바뀐다
