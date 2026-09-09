import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        int currNum = n;
        while(n!=0){
            if(n%2==0){
                n/=2;
            }
            else{
                n-=1;
                n/=2;
                ans++;
            }
        }


        return ans;
    }
}