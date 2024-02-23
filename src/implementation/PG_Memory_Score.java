package implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length]; // 배열 초기화
        // name 배열에 이름이 있어야 점수가 포함됩니다.
        for (int k = 0; k < name.length; k++) {
            for (int i = 0; i < photo.length; i++) {
                for (int j = 0; j < photo[i].length; j++) {
                    if (photo[i][j].equals(name[k])) {
                        answer[i] += yearning[k];
                    }
                }
            }
        }
        return answer;
    }
}

class Solution_2 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String,Integer> map = new LinkedHashMap<>();
        //Map : 키(Key)와 값(value)의 쌍으로 연관지어 이루어진 데이터의 집합
        for(int i=0; i< name.length; i++){
            map.put(name[i],yearning[i]);
        } //HashMap사용하여 name : yearning과 매치. 두개의 인덱스 번호가 비례하기 때문!

        for(int i =0; i< photo.length;i++){
            String[] persons = photo[i];//photo 이중배열 한 행씩 저장
            int score = 0;
            for(int j=0; j<persons.length; j++){
                String person = persons[j];
                if(map.containsKey(person)){//map 에서 이름 있는지 확인하는 코드
                    score+=map.get(person);//map에서 name에 대응하는 yearning값 더해줌.(있다면)
                }
            }
            answer[i]=score;
        }

        return answer;


    }
}

public class PG_Memory_Score {
    public static void main(String[] args) {
        String[] name={"may", "kein", "kain", "radi"};
        int[] score={5, 10, 1, 3};
        String [][] photo={{"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}};
        Solution sol= new Solution();
        int[] answer= sol.solution(name,score,photo);
        for(int result : answer){
            System.out.println(result); //위 코드 예시에서는 배열 answer의 각 원소를 순회하며, 각 원소를 개별적으로 출력합니다.
            // 이는 배열의 각 값이 개별적으로 출력되기 때문에, 대괄호나 쉼표 없이 순수한 값만 콘솔에 표시됩니다.
        }
        System.out.println(Arrays.toString(answer));
        Solution_2 answer2=new Solution_2();
        int [] result_2=answer2.solution(name,score,photo);
        System.out.println(Arrays.toString(result_2));
    }
}
