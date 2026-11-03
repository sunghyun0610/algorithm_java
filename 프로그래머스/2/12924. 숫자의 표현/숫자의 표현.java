class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i=1;i<n;i++){
            int sum = i;
            int temp = i;
            while(sum<n){
                temp++;
                sum+=temp;
                if(sum==n) answer++;
            }
        }
        return answer;
    }
}
//투포인터?