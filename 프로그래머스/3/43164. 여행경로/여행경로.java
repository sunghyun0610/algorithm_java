import java.util.*;
class Solution {
    
    static boolean[] visited;
    static List<List<String>> answerList;
    public String[] solution(String[][] tickets) {
        
        int routeNum = tickets.length+1;
        visited = new boolean[tickets.length];
        String[] answer = new String[routeNum];
        answerList = new ArrayList<>();
        //Collections.sort(answerList);
        List<String> result = new ArrayList<>();
        
        result.add("ICN");
        Arrays.sort(tickets, (a, b) -> {
    if (a[0].equals(b[0])) {
        return a[1].compareTo(b[1]);
    }
    return a[0].compareTo(b[0]);
});
        dfs("ICN",tickets,1,routeNum,visited,result);
        
        answer = answerList.get(0).toArray(new String[0]);
        
        return answer;
    }
    static void dfs(String start, String[][] tickets, int cnt,int end, boolean[] visited,
                   List<String> result){
        
        if(cnt==end){
            answerList.add(result);
            return;
        }
        
        for(int i=0;i<tickets.length;i++){
            List<String> temp = new ArrayList<>(result);
            String startPlace = tickets[i][0];
            String desPlace = tickets[i][1];
            if(!visited[i] && startPlace.equals(start)){
                visited[i] = true;
                temp.add(desPlace);
                dfs(desPlace,tickets,cnt+1,end,visited,temp);
                visited[i] = false;
            }
        }
       
        
    }
}