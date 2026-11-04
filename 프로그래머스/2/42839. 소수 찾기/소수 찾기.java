import java.util.*;
class Solution {
    static Set<Integer> numberList;
    public int solution(String numbers) {
        int answer = 0;
        numberList = new HashSet<>();
        dfs("",numbers);
        for(Integer k: numberList){
            // System.out.println(k);
            if(isPrimeNum(k)) answer++;
        }
        
        return answer;
    }
    static void dfs(String curr ,String remain){
        int len = remain.length();
        if(!curr.equals("")){
            numberList.add(Integer.parseInt(curr));
        }
        if(len==0) return; //다 쓴거임
        for(int i=0;i<len;i++){
            char ch = remain.charAt(i);
            dfs(curr+ch, remain.substring(0,i) + remain.substring(i+1));
        }
    }
    
    static boolean isPrimeNum(int num){
        if(num <2) return false;
        int sqrt = (int)Math.sqrt(num);
        for(int i=2;i<=sqrt;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
//숫자들로 소수 만드는 가지수