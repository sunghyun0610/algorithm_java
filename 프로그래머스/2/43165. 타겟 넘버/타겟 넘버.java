class Solution {
    static int[] temp;
    static int cnt=0;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        temp = numbers;
        dfs(0,target,0);
        answer=cnt;
        return answer;
    }
    public static void dfs(int sum, int target, int index){
        //System.out.println("sum: "+ sum + " target : "+ target +" index :"+index);
        if(index==(temp.length)){
            //System.out.println("index: "+ index + "temp.length : "+ temp.length + " sum : "+sum);
            if(sum==target) cnt++;
            return;
        }
        for(int i=0;i<2;i++){
            if(i==0) dfs(sum+temp[index],target,index+1);
            else if(i==1) dfs(sum-temp[index],target,index+1);
        }
    }
}