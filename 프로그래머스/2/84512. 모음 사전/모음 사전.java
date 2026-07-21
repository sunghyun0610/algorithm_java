import java.util.*;
class Solution {
    public int solution(String word) {
        int answer = 0;
        List<String> wordList = new ArrayList<>();
        String alpha = "AEIOU";
        recur(alpha,wordList,"");
        Collections.sort(wordList);
        answer = wordList.indexOf(word) +1 ;
        
        return answer;
    }
    static void recur(String alpha, List<String> wordList, String currWord){
        int wordLen = currWord.length();
        if(wordLen==5) return;
        for(int i=0; i<5;i++){
            String newWord = currWord + alpha.charAt(i);
            wordList.add(newWord);
            recur(alpha,wordList,newWord);
        }
    }
}
//경우의수가 작으므로 완탐가능 5^5