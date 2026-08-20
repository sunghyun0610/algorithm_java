class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int temp = n;
        String transferNum = Integer.toString(n,k);
        int idx = 0;
        int len = transferNum.length();
        while(idx<len){
            int start = idx;
            char ch = transferNum.charAt(idx);
            if(ch=='0'){
                idx++;
                continue;
            }
            while(idx<len && transferNum.charAt(idx) != '0'){
                idx++;
            }
            String tmpStr = transferNum.substring(start,idx);
            
            long tmpNum = Long.parseLong(tmpStr);
            if(isPrime(tmpNum)){
                answer++;
            }
            idx++;
          
            
        }
        return answer; 
    }
    
    private static boolean isPrime(long num){
        // System.out.println("들어온 수 : "+ num);
        if(num==1||num==0) return false;
        if(num==2||num==3) return true;
        int rootNum = (int) Math.sqrt(num);
        for(int i=2;i<=rootNum;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
// P가 소수임
// 0P0처럼 양쪽에 0 이 있는경우
// P0 , 0P 처럼 한쪽에 있는경우
//P처럼 소수 양쪽에 아무것도 없는 경우
// P는 각 자릿수에 0을 포함하지 않는 소수이다.