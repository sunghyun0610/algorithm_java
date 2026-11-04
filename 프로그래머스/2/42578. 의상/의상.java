import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        int clothesCnt = clothes.length;
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<clothesCnt;i++){
            String type = clothes[i][1];
            String name = clothes[i][0];
            if(map.containsKey(type)){
                List<String> list = map.get(type);
                list.add(name);
                map.put(type, list);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(name);
                map.put(type,list);
            }
        }
        int sum = 1;
        List<Integer> sizeList = new ArrayList<>();
        for(String k : map.keySet()){
            // System.out.println(map.size());
            List<String> temp = map.get(k);
            sizeList.add(temp.size());
            sum*=(temp.size()+1);
        }
        
        return sum-1;
    }
}
//서로 다른 조합으로 옷을 입어야한다
//서로 다른 옷의 조합의 수