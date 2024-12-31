class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int cnt1=0;//cards1에대한 인덱스
        int cnt2=0;//2에대한 인덱스
        for(int i=0;i<goal.length;i++){
            if(cnt1<cards1.length && cards1[cnt1].equals(goal[i])){
                cnt1++;
            }
            else if(cnt2<cards2.length && cards2[cnt2].equals(goal[i])){
                cnt2++;
            }
            else{
                answer = "No";
                break;
            }
        }
        return answer;
    }
}