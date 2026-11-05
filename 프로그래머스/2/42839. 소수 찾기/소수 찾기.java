import java.util.*;
class Solution {
    static Set<Integer> numList;
    public int solution(String numbers) {
        int answer = 0;
        numList = new HashSet<>();
        makeNum("",numbers);
        for(Integer k : numList){
            if(isPrime(k)) answer++;
        }
        return answer;
    }
    
    void makeNum(String curr, String remain){
        if(!curr.equals("")) numList.add(Integer.parseInt(curr));
        int len = remain.length();
        if(len==0) return;
        
        for(int i=0;i<len;i++){
            char ch = remain.charAt(i);
            makeNum(curr+ch, remain.substring(0,i)+remain.substring(i+1));
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