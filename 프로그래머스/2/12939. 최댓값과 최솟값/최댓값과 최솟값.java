
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] numberStr = s.split(" ");
        int size = numberStr.length;
        int[] number = new int[size];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<size;i++){
            max = Math.max(max, Integer.parseInt(numberStr[i]));
            min = Math.min(min, Integer.parseInt(numberStr[i]));
        }
        answer.append(min);
        answer.append(" ");
        answer.append(max);
        return answer.toString();
    }
}