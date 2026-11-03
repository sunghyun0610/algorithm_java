class Solution {
    static int cnt;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        cnt = 0;
        dfs(numbers,target,0,0);
        answer = cnt;
        return answer;
    }
    
    static void dfs(int[] numbers, int target, int idx, int sum){
        if(idx==numbers.length && sum == target){
            // System.out.println(sum);
            cnt++;
            return;
        }
        if(idx> numbers.length-1) return;
        // System.out.println(sum);
        dfs(numbers, target, idx+1,sum+numbers[idx]);
        dfs(numbers,target, idx+1, sum-numbers[idx]);
    }
}
//타겟 넘버를 만드는 방법의 수
//모든 숫자 다 써야함
//