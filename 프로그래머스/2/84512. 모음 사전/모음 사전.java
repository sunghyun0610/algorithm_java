import java.util.*;
class Solution {
    static Set<String> wordList;
    static char[] alpha = {'A','E', 'I','O','U'};
    public int solution(String word) {
        int answer = 0;
        wordList = new HashSet<>();
        List<String> list = new ArrayList<>();
        makeWord("",0);
        for(String k : wordList){
            list.add(k);
        }
        Collections.sort(list);
        answer = list.indexOf(word);
        return answer+1;
    }
    void makeWord(String curr, int len){
        if(len==5){
            wordList.add(curr);
            return;
        }
        if(!curr.equals("")){
            wordList.add(curr);
        }
        for(int i=0;i<alpha.length;i++){
            char ch = alpha[i];
            makeWord(curr + ch, len+1);
        }
    }
}