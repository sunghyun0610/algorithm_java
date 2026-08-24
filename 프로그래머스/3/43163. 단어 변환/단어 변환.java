import java.util.*;

class Solution {
    static class Info{
        String letter;//지금 문자열이 뭔지
        int cnt;//몇번 탐색했는지
        Info(String letter, int cnt){
            this.letter = letter;
            this.cnt=cnt;
        }
    }
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        int wordLen = words.length;
        boolean [] visited = new boolean[wordLen];
        return bfs(begin,target,words,visited);
        
       
    }
    static int bfs(String begin, String target, String[] words, boolean[] visited){
        Queue<Info> queue = new LinkedList<>();
        queue.add(new Info(begin,0));
        int targetLen = target.length();//이게 문자열 길이임
        while(!queue.isEmpty()){
            Info currInfo = queue.poll();
            String currWord = currInfo.letter;
            int currCnt = currInfo.cnt;
            List<String> linkStr = new ArrayList<>();
            if(currWord.equals(target)){
                // System.out.println("끝 "+ currCnt);
                return currCnt;
                
            } 
            for(int i=0;i<words.length;i++){
                if(!visited[i] && isLinkedWord(currWord, words[i])){
                        // System.out.println("들어옴?" + words[i]);
                        linkStr.add(words[i]);
                        visited[i] = true;
                    }
            }
            for(int i=0; i<linkStr.size();i++){
                queue.add(new Info(linkStr.get(i),currCnt+1));
            }
            
            
        }
        return 0;
    }
    
    static boolean isLinkedWord(String str1, String str2){
        int len = str1.length();
        for(int i=0;i<len;i++){
            String front1 = str1.substring(0,i);
            String back1 = str1.substring(i+1);
            String front2 = str2.substring(0,i);
            String back2 = str2.substring(i+1);
            if(front1.equals(front2) && back1.equals(back2)) return true;
        }
        return false;
    }
}
//begin -> target 변환하는 가장 짧은 변환과정 / 변환 불가하면 0 return
//변환 규칙 1.한번에 한개의 알파벳만 바꾼다
// 규칙 2. words에 있는 단어로만 변환 가능하다 (중복된 단어는 없다)