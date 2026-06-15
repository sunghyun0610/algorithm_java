class Solution {
    public int solution(int n) {
        int answer = 0;
        int start =1;
        int end =1;
        int sum =0;
        int cnt=0;
        while(start!=n){
            for(int i=start;i<=end;i++){
                sum+=i;
            }
            if(sum<n){
                end++;
                sum=0;
            }
            else if(sum==n){
                start+=1;
                end=start;
                cnt++;
                sum=0;
            }
            else{
                start+=1;
                end=start;
                sum=0;
            }
        }
        answer=cnt+1;
        return answer;
    }
}
//전 계산 결과값을 이용? DP?