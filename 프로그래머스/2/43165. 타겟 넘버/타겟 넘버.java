class Solution {
    static int count;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        count =0;
        dfs(numbers,target,0,0);
        answer =count ;
        return answer;
    }
    static void dfs(int [] numbers,int target, int sum, int index){
        int len = numbers.length;
        if(index == len){
            // System.out.println("sum : "+sum);
            if(target == sum){
                count++;
                return;
            }
            return;
        }
        dfs(numbers, target, sum+numbers[index], index+1);
        dfs(numbers,target, sum-numbers[index], index+1);
        
    }
}