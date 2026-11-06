import java.util.*;

class Solution {
    static int answer;
    public int solution(int[] nums) {
        answer = 0;
        boolean[] visited = new boolean[nums.length];
        makeComb(nums,0,0,0);
        return answer;
    }
    void makeComb(int[] nums, int cnt, int currNum, int start){
        // if(idx>=nums.length) return;
        if(cnt==3){
            // System.out.println("ㅇ");
            if(isPrime(currNum)) answer++;
            return;
        }
        for(int i=start;i<nums.length;i++){
            makeComb(nums,cnt+1,currNum+nums[i], i+1);
        }
    }
    
    boolean isPrime(int num){
        if(num<2) return false;
        int sqrt = (int)Math.sqrt(num);
        for(int i=2;i<=sqrt;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
//3개를 골라 더했을 때 소수가 되는 경우의 수