class Solution {
    public int solution(int n) {
        int answer = 0;
        int range = (int)(Math.sqrt(n));
        if(n>0){
            answer+=1;
        }
        for(int i=2;i<=range;i++){
            if(n%i==0){
                answer+=i;
                answer+=(n/i);
            }
        }
        if(range == Math.sqrt(n)){
            answer-=range;
        }
        answer+=n;
        return answer;
    }
}