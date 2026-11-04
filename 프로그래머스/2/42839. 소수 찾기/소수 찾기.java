import java.util.*;
class Solution {
    static Set<Integer> combList;
    public int solution(String numbers) {
        int answer = 0;
        combList = new HashSet<>();
        makeComb("",numbers);
        for(int k: combList){
            if(isPrime(k)) answer++;
        }
        return answer;
    }
    void makeComb(String curr, String remain){
        int len = remain.length();
        if(!curr.equals("")){
            combList.add(Integer.parseInt(curr));
        }
        if(len==0) return;
        for(int i=0;i<len;i++){
            char ch = remain.charAt(i);
            makeComb(curr+ch, remain.substring(0,i)+ remain.substring(i+1));
        }
    }
    
    boolean isPrime(int num){
        if(num<2)  return false;
        int sqrt = (int) Math.sqrt(num);
        for(int i=2;i<=sqrt;i++){
            if(num%i==0) return false;
            
        }
        return true;
    }
}
//문자열로 만들 수 있는 모든 숫자 조합 -> 중복 제거 위해 set에 저장
//소수인지 비교하자