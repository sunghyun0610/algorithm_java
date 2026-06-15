class Solution {
    public int solution(int n) {
        int answer = 0;
        int start =1;
        int end =1;
        int sum =1;
        int cnt=0;
        while(start<=n){
            if(sum<n){
                end++;
                sum+=end;
            }
            else if(sum==n){
                cnt++;
                sum-=start;
                start++;
            }
            else{
                sum-=start;
                start++;
            }
        }
        answer=cnt;
        return answer;
    }
}
//전 계산 결과값을 이용? DP?