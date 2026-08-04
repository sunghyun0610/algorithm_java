import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
class Solution {
    static List<Integer>[] graph;
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        
        //그래프는 양방향임
        graph = new ArrayList[n+1];
        for(int i=0;i<n+1;i++){
            graph[i] = new ArrayList<>();
        }
       
       
        for(int i=0; i<roads.length;i++){
            int link1 = roads[i][0];
            int link2 = roads[i][1];
            graph[link1].add(link2);
            graph[link2].add(link1);

        }//연결 리스트로 그래프 표현 끝
        
        //sources 원소 크기만큼 bfs돌린다
        int num = sources.length;//부대원 숫자
        int[] answer = new int[num];
        int[] disFromDes = new int[n+1];
        boolean[] visited = new boolean[n+1];
        bfs(destination, visited,disFromDes);
        for(int i=0;i<num;i++){
            int place = sources[i];
           
            int time = disFromDes[place];
            if(time==0){
                if(place==destination) time=0;
                else time=-1;
            }
            answer[i]=time;
        }
        return answer;
    }
    static int bfs(int start,boolean[] visited, int[] disFromDes){
        visited[start] = true;
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queueCnt = new LinkedList<>();
       
        queue.add(start);
        queueCnt.add(0);
        while(!queue.isEmpty()){
            int currIndex = queue.poll();
            int currCnt = queueCnt.poll();
            disFromDes[currIndex] = currCnt;
            List<Integer> nextIndexList = graph[currIndex];
            for(int i=0;i<nextIndexList.size();i++){
                int nextIndex = nextIndexList.get(i);
               
                if(!visited[nextIndex]){
                    visited[nextIndex]=true;
                    queue.add(nextIndex);
                    queueCnt.add(currCnt+1);
                }
            }
        }
        return -1;
    }
}

//이거 그냥 bfs돌리면 시간초과 안나나?
//근데 DP는 애매한데..
//union find로 연결부터 알아봐야하나?
// destination ~> 각 노드로 최단거리 구하자