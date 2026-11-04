import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int sum1=0;
        int sum2=0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length();i++){
            stack.push(s.charAt(i));
        }
        if(stack.peek()=='(') return false;
        if(s.charAt(0)==')') return false;
        while(!stack.isEmpty()){
            if(stack.pop()==')'){
                sum2++;
            }else{
                sum1++;
            }
            if(sum1>sum2) return false;
        }
        if(sum1==sum2) answer = true;
        return answer;
    }
}