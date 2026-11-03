class Solution {
    public int solution(int n) {
        int answer = 0;
        int start = 1;
        int end = start;
        int sum = 1;
        while(start<=n){
            if(sum<n){
                end++;
                sum+=end;
            }
            else if(sum == n){
                
                sum-=start;
                start++;
                answer++;
            }
            else{
                sum-=start;
                start++;
            }
        }
        return answer;
    }
}