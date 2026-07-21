import java.util.*;
class Solution {
    static Queue<String> queue  = new LinkedList<>();
    static boolean[] visited;
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        int wordsLen = words.length;
        int wordLen = target.length();// 모든 단어의 길이가 같다
        visited = new boolean[wordsLen];
        boolean isHasTarget = false;
        for(int i=0;i<wordsLen;i++){
            if(words[i].equals(target)){
                isHasTarget=true;
            }
        }
        if(!isHasTarget) return 0;
        answer = bfs(begin,target, words, wordLen);
        return answer;
    }
    public static int bfs(String word, String target, String[] words, int wordLen){
        Queue<Integer> countQueue = new LinkedList<>();
        countQueue.add(0);
        int len = words.length;
        queue.add(word);
        while(!queue.isEmpty()){
           //System.out.println("cnt : "+cnt);
        String currWord = queue.poll(); //현재 문자열
        int cnt = countQueue.poll(); // 현재 변환 횟수변수
        if(cnt>=len) return 0;
        for(int i=0;i<words.length;i++){ //전체 문자 배열에서 탐색한다
            char diffChar=' ';
            int diffIndex = 0;
            
            for(int j=0;j<wordLen;j++){ // 해당 문자열과 비교 문자열 2개 비교
                if(currWord.charAt(j)!= words[i].charAt(j)){
                    diffChar = currWord.charAt(j);
                    diffIndex = j;
                    //System.out.println("diffChar : "+diffChar + "diffIndex : "+diffIndex);
                    break;
                    
                }
            }
            if(diffChar!=' ' && diffIndex>=0){
                if((currWord.substring(0,diffIndex) + currWord.substring(diffIndex+1)).equals(words[i].substring(0,diffIndex)+words[i].substring(diffIndex+1)) && !visited[i]){
                    // System.out.println("String 1 : "+(currWord.substring(0,diffIndex) + currWord.substring(diffIndex+1) + "String2 : "+ words[i].substring(0,diffIndex)+words[i].substring(diffIndex+1)));
                    queue.add(words[i]);
                    visited[i]=true;
                    countQueue.add(cnt+1);
                    //System.out.println("현재 문자열 : "+ currWord + " 다음 문자열 : "+words[i]);
            if(words[i].equals(target)){
            return cnt+1;
        }
                    }
                }
            }
        }
            return 0;
    }
}
//한글자만 바뀐지 체크는 substring으로 앞뒤 같은지 체크해보자.
// 그래프에서 한글자만 바뀐 것끼리만 연결되어있는 것임.