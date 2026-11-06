class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=2;i<=n;i++){
            int sqrt = (int)Math.sqrt(i);
            boolean isPrime =true;
            for(int j=2;j<=sqrt;j++){
                if(i%j==0) {//소수가 아닌거임
                    // System.out.println("i :"+i + " j: "+j);
                    isPrime = false;
                    break;
                }
            }
            // System.out.println(i);
            if(isPrime) {
                answer++;
                // System.out.println(i);
            }
        }
        return answer;
    }
}