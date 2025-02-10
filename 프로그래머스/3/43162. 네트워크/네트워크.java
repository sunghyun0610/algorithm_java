class Solution {
    static boolean[] visited;
    static int cnt=0;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                dfs(i,n,computers);
                answer++;
            }
        }
        return answer;
    }
    static void dfs(int x,int n,int [][] computers){
        visited[x]=true;
        for(int i=0;i<n;i++){
            if(computers[x][i]==1 && visited[i]==false){
                dfs(i,n,computers);
            }
        }

    }
}