import java.util.*;
class Solution {
    public long solution(int[] sequence) {
        long answer = 0;
        int len = sequence.length;
        int [] arr1 = new int[len]; //펄스 +1로시작하는거
        int [] arr2 = new int[len]; // 펄스 -1로 시작하는거
        for(int i=0;i<len;i++){
            if(i%2==0){
                arr1[i] =sequence[i];
                arr2[i] = -sequence[i];
            }
            else{
                arr1[i] = -sequence[i];
                arr2[i] = sequence[i];
            }
        }
        //배열에서 최대 연속 합문제로 바뀜 Kaden
        long curr1=arr1[0];
        long max1 = arr1[0];
       for(int i=1;i<len;i++){
           curr1 = Math.max(arr1[i],curr1+arr1[i]);
           max1 = Math.max(max1,curr1);
       }
        long curr2=arr2[0];
        long max2 = arr2[0];
       for(int i=1;i<len;i++){
           curr2 = Math.max(arr2[i], curr2+arr2[i]);
           //System.out.println(curr2);
           max2 = Math.max(curr2,max2);
       }
        answer = Math.max(max2,max1);
        return answer;
    }
}