import java.util.*;

class Solution {
    static Set<List<String>> resultSet;
    static boolean[] used;
    public int solution(String[] user_id, String[] banned_id) {
        int answer = 0;
        resultSet = new HashSet<>();
        used = new boolean[user_id.length];
        List<String> currMatchIdList = new ArrayList<>();
        dfs(user_id,banned_id,used,currMatchIdList);
        answer = resultSet.size();
        return answer;
    }
    static void dfs(String[] user_id, String[] banned_id, boolean[] visited, 
                    List<String> currMatchIdList){
        int currLen = currMatchIdList.size();
        if(currLen==banned_id.length){//현재 제제아이디 목록 길이와 ban해야할 id길이가 같다면 조합이 완성된것
            List<String> result = new ArrayList<>(currMatchIdList);
            Collections.sort(result); // 정렬을 해야 set 비교가 된다
            resultSet.add(result);//결과 set에다가 제제 아이디 조합 추가
            return;
        }
        String banId = banned_id[currLen];//이번에 탐색할 banId
        
        for(int i=0; i<user_id.length;i++){
            if(!visited[i] && isMatch(user_id[i], banId)){
                visited[i] = true;
                currMatchIdList.add(user_id[i]);
                // System.out.println("추가되는 user_id  :" + user_id[i] + currMatchIdList.toString());
                dfs(user_id, banned_id, visited, currMatchIdList);
                visited[i] = false;
                currMatchIdList.remove(currMatchIdList.size()-1);
                // System.out.println("제거되는 user_id :" + u-ser_id[i] + " "+currMatchIdList.toString());
            }
        }
    }
    
    private static boolean isMatch(String userId, String banId){
        if(userId.length() != banId.length()){
            return false;
        }
        for(int i=0; i<userId.length();i++){
            if(banId.charAt(i) == '*') continue;
            if(userId.charAt(i) != banId.charAt(i)) return false;
        }
        return true;
    }
}
//불량 사용자 : 당첨 처리 시 제외
// 문자에 마스킹 : 1. 문자 하나당 * 하나 사용 + 2.아이디 하나 당 최소 하나의 * 사용함
//제제 아아디 목록의 경우의 수를 구하시오
//user_id배열 크기 8 , 문자열 길이 8이하 -> 크기가 너무 작다 완탐? ( 아이디 중복도 없음)
// 중복 아이디 찾고 Set에 저장하면 알아서 중복된 조합은 제거 될듯?
