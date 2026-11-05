import java.util.* ;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();
        for(int i=0;i<want.length;i++){
            String product = want[i];
            int num = number[i];
            wantMap.put(product,num);
        }
        for(int i=0; i<=discount.length-10;i++){
            Map<String,Integer> tempMap = new HashMap<>();
            boolean bool = true;
            for(int j=i;j<i+10;j++){
                String pName = discount[j];
                tempMap.put(pName, tempMap.getOrDefault(pName,0)+1);
            }
            for(String k : wantMap.keySet()){
                int wantCnt = wantMap.get(k);
                if(tempMap.containsKey(k)){
                    int disCnt = tempMap.get(k);
                    if(disCnt>=wantCnt) bool = true;
                    else{
                        bool=false;
                        break;
                    }
                }
                else{
                    bool=false;
                    break;}
            }
            if(bool) answer++;
        }
        return answer;
    }
}
//일정 금액 지불 -> 10일동안 회원 자격
//회원 대상 : 매일 한 가지 할인 제품 행사
//할인하는 제품은 하루에 하나씩만 구매
//자신이 원하는 제품과 수량이 할인하는 날짜와 10일연속 일치할 경우에 맞춰서 회원가입 하려한다
//회원가입 시 원하는 제품을 모두 할인 받을 수 있는 가입 날짜 총 일수 (없으면 0)