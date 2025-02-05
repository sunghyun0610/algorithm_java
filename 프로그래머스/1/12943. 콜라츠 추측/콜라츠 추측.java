class Solution {
    public int solution(int num) {
        int answer = 0;//몇번하는지 횟수
        long tmp = num;
        while(tmp!=1){
            if(tmp%2==0){
                tmp=tmp/2;
                answer++;
            }
            else{
                tmp= (tmp*3) +1;
                answer++;
            }
            if(answer==500){
                return -1;
            }
        }
        return answer;
    }
}