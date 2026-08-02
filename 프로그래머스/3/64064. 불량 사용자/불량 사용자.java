import java.util.Map;
import java.util.HashMap;
import java.util.*;

class Solution {
    static Set<List<String>> resultSet;
    static boolean[] visited;
    public int solution(String[] user_id, String[] banned_id) {
        int answer = 0;
        Map<String, String[]> bannedIdMatchedMap = new HashMap<>();
        resultSet = new HashSet<>();//이 set사이즈가 결국 answer이 되겠네
        visited = new boolean[user_id.length];
        List<String> currIdList = new ArrayList<>();
        dfs(user_id, banned_id, visited,currIdList);
        answer = resultSet.size();
        return answer;
    }
    static void dfs(String[] user_id, String[] banned_id, boolean[] visited,
                    List<String> currIdList){
        int currIdSize = currIdList.size();
        if(currIdList.size() == banned_id.length){
            Collections.sort(currIdList); //정렬해서 set에 넣어야지 중복제거 가능
            resultSet.add(currIdList); //배열이 아닌 List로 넣어야지 set에서 중복제거가됨
            return;
        }
       String banId = banned_id[currIdSize];//현재 금지된 아이디 몇번째까지 탐색한건지
       for(int i=0;i<user_id.length;i++){
           if(isMatch(user_id[i],banId)){//userId랑 banId랑 매치가 되는지 여부 확인
               if(!visited[i]){//이미 사용된 아이디가 아니라면
                   visited[i] = true;
                   currIdList.add(user_id[i]);
                   dfs(user_id,banned_id,visited,currIdList);
                   visited[i] = false;
                   currIdList.remove(user_id[i]);
               }
           }
       }
        
    }
    private static boolean isMatch(String userId, String banId){
        if(userId.length() != banId.length()){
            return false;
        }
        for(int i=0;i<userId.length();i++){
            char userChar = userId.charAt(i);
            char banChar = banId.charAt(i);
            
            if(banChar == '*') continue;
            
            if(userChar==banChar)continue;
            else{
                return false;
            }
        }
        return true;
    }
}
//불량 사용자 -> 당첨 처리 시 제외
//아이디 마스킹
// 1. 문자 하나당 *한개 사용
// 2. 아이디 당 최소 하나 이상의 * 사용
// 당첨에서 제제 아이디 목록은 몇가지 경우수가 가능한지 return
// 매칭이 되려면 ,
// 1. 문자열 길이 같아야함, 2.모든 부분문자열 포함해야함

//아이디 목록이 8개밖에안됨(길이도 8 이하)