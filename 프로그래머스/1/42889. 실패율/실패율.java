import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];//N개만큼의 스테이지가 있다
        double[] fail = new double[N+1];//1인덱스와 1번스테이지와 맞춰주기위해
        Arrays.sort(stages);//탐색하기 쉽게 오름차순정렬
        int people = stages.length;
        int idx=0;//stages의 인덱스
        for(int i=1; i<=N;i++){
            int cnt=0;
            
            while(idx < stages.length && stages[idx]<=i){
                if(stages[idx]==i){cnt++;}
                idx++;
            }
            if(people ==0){
                fail[i] = 0.0;
            }else{fail[i] = (double) cnt /people;} // i번쨰 단계에서 실패율}
            people-=cnt;//전단계에 머무는 인원수만큼 제외
        }
        double[] copy = Arrays.copyOfRange(fail,1,N+1);
        Arrays.sort(copy);
        boolean[] failCheck = new boolean[N+1];
        int k=0;// answer 배열의 인덱스
        for(int i=copy.length-1;i>=0;i--){
            for(int a=1;a<=N;a++){
                if(fail[a]==copy[i] && failCheck[a] == false){
                    answer[k]=a;
                    failCheck[a] = true;
                    k++;
                }
            }
        }
        return answer;
    }
}

//전체 스테이지 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지 번호 배열 stages
//stages의 크기 == 총사용자 수
//stages의 N+1 사용자는 끝까지 다 깬 사람
//실패율이 높은 스테이지부터 내림차순으로 스테이지 번호가 담긴 배열 answer\
//일단 각 단계의 실패율 구하고 -> 실패율과 단계를 매치하기
//실패율 = 그 단계 사람 수 / 