class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        for(int i=0;i<s.length();i++){
            answer=Math.max(isExpand(s,i,i),answer);
            answer=Math.max(isExpand(s,i,i+1),answer);
            // System.out.println("I : "+i+ " answer: "+answer);
        }

        return answer;
    }
    static int isExpand(String s, int left, int right){
        int len = s.length();
        // System.out.println("처음left : "+left+ " 처음right: "+right);
        
        while(left>=0 && right<len ){
            if(s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }
            else{
                break;
            }
        }
        //System.out.println("결과left : "+left+ " 결과right: "+right);
        return right-left-1;
    }
}
//중심문자가 1개인경우
//중심문자가 2개인경우