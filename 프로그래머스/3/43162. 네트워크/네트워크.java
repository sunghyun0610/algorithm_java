class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                answer++;
                dfs(i,computers,visited);
            }
        }
        return answer;
    }
    static void dfs(int num, int[][] computers, boolean[] visited){
        visited[num]=true;
        int [] linkArr = computers[num];
        for(int i=0; i<linkArr.length;i++){
            if(!visited[i] && linkArr[i]==1){
                dfs(i,computers,visited);
            }
        }
    }
}