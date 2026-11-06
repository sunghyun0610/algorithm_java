import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int len = photo.length;
        int[] answer = new int[len];
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<name.length;i++){
            String n = name[i];
            int score = yearning[i];
            map.put(n,score);
        }// 인물 별 추억점수 매핑 완료
        for(int i=0;i<len;i++){
            int sum=0;
            String[] temp = photo[i];
            for(int j=0;j<temp.length;j++){
                String person = temp[j];
                sum+=map.getOrDefault(person,0);
            }
            answer[i] = sum;
        }
        return answer;
    }
}
//사진들의 추억점수를 배열에 담아 구하라