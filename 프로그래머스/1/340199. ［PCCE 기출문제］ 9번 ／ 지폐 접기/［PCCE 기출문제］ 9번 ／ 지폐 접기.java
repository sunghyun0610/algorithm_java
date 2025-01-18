class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;//지폐를 접은 횟수
        int w_max = wallet[0]>wallet[1] ? wallet[0] : wallet[1];
        int b_max = bill[0]>bill[1] ? bill[0] : bill[1];
        int w_min=0;
        int b_min =0;
        if(w_max==wallet[0]){
            w_min=wallet[1];
        }
        else{
            w_min=wallet[0];
        }
        if(b_max==bill[0]){
            b_min=bill[1];
        }else{
            b_min=bill[0];
        }
        while(b_min>w_min || b_max>w_max){
            b_max/=2;
            answer++;
            if(b_max<b_min){
                int tmp=0;
                tmp=b_max;
                b_max=b_min;
                b_min=tmp;
            }
        }
        
        return answer;
    }
}
//항상 길이가 긴 쪽을 반으로 접는다
//길이가 홀수라면 접은 후 소수점 이하는 버린다 -> 즉그냥 /2하면됨
//접힌 지폐를 그대로 혹은 90도 회전하여 넣을 수 있다면 그만 접는다
