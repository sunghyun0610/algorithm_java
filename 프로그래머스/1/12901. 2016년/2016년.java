class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] month = {0,31,29,31,30,31,30,31,31,30,31,30,31};
        int sum=0;
        for(int i=1;i<a;i++){
            sum+=month[i];
        }
        sum+=b;
        int result = sum-1;//날짜에서 - 1월1일
        int rest = result%7;
        switch(rest){
            case 0: answer ="FRI";
                break;
            case 1 : answer = "SAT";
                break;
            case 2 : answer = "SUN";
                break;
            case 3 : answer = "MON";
                break;
            case 4 : answer = "TUE";
                break;
            case 5 : answer = "WED";
                break;
            case 6 : answer = "THU";
                break; 
        }
         
        return answer;
    }
}//윤년이다 2월 29일까지
//일로 치환해서 7로 나눠보자