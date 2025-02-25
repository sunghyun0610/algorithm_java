import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int size = commands.length;
        int[] answer = new int[size];
        
        for(int i=0;i<size;i++){
            int a =commands[i][0];
            int j =commands[i][1];
            int k =commands[i][2];
            int len=j-a+1;
            int [] tmpArr = new int[len];
            for(int l=0;l<len;l++){
                tmpArr[l] = array[a+l-1];
            }
            Arrays.sort(tmpArr);
            answer[i]= tmpArr[k-1];
        }
        
        return answer;
    }
}
//i부터 j까지 배열 자르고 정렬후 k번째 숫자 구하여라