import java.util.*;

class Solution {
    public String solution(String number, int k) {
        int n = number.length();
        int keep = n - k;  // 최종적으로 남겨야 하는 숫자의 개수
        
        StringBuilder stack = new StringBuilder();
        int removed = 0;
        
        for (int i = 0; i < n; i++) {
            char cur = number.charAt(i);
            // 스택에 담긴 마지막 숫자가 현재 숫자보다 작고,
            // 아직 제거할 수 있는 횟수가 남아 있다면 제거
            while (stack.length() > 0 && removed < k && stack.charAt(stack.length() - 1) < cur) {
                stack.deleteCharAt(stack.length() - 1);
                removed++;
            }
            stack.append(cur);
        }
        
        // 모든 숫자를 다 확인한 후에도 k만큼 제거하지 못한 경우, 뒤에서부터 제거
        if (stack.length() > keep) {
            stack.setLength(keep);
        }
        
        return stack.toString();
    }
}
