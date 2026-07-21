class Solution {
    static boolean[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int len = computers.length;
        visited = new boolean[len];
        for(int i=0;i<len;i++){
            if(visited[i]) continue;
            else{
                dfs(i, computers);
                answer++;
            }
        }
        return answer;
    }
    public static void dfs(int num, int[][] computers){
        visited[num] = true;
        for(int i=0;i<computers[num].length;i++){
            if(computers[num][i]==1 && !visited[i]){
                dfs(i,computers);
            }
        }
    }
}
//유니온파인드?
// 전체 네트워크 개수를 구하는 문제니까 dfs?