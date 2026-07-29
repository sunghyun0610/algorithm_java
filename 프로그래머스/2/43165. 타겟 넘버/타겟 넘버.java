class Solution {
    static int cnt;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        cnt=0;
        recur(0,numbers,target,0);
        answer=cnt;
        return answer;
    }
    static void recur(int index, int[] numbers, int target, int sum){
        if(index==numbers.length && target == sum){
            cnt++;
            return;
        }
        if(index==numbers.length) return;
        //-로 더하거나
        recur(index+1,numbers,target,sum-numbers[index]);
        //+로 더하거나
        recur(index+1,numbers,target,sum+numbers[index]);
    }
}
//사용한 숫자를 다 써야함