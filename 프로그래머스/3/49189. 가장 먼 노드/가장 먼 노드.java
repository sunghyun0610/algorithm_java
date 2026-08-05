import java.util.*;



class Solution {
    static int[] lenArr;

    public int solution(int n, int[][] edge) {

        int answer = 0;

        boolean[] visited = new boolean[n+1];
        lenArr = new int[n+1];

        List<Integer>[] graph = new ArrayList[n+1];

        for(int i=0;i<graph.length;i++){

            graph[i] = new ArrayList<>();

        }

        for(int i=0;i<edge.length;i++){

            int start = edge[i][0];

            int end = edge[i][1];

            graph[start].add(end);

            graph[end].add(start);

        }
        bfs(1,graph,visited);
        Arrays.sort(lenArr);
        int maxLen = lenArr[n];
        int idx = n;
        
        while(idx>=2 && lenArr[idx]==maxLen){
            answer++;
            idx--;
        }

        return answer;

    }

    static void bfs(int start, List<Integer>[] graph, boolean[] visited){

        Queue<Integer> queue = new LinkedList<>();


        visited[start] = true;

        queue.add(start);


        int cnt=0;

        while(!queue.isEmpty()){

            cnt=0;

            int currNode = queue.poll();


            List<Integer> temp = graph[currNode];

            for(int i=0; i<temp.size();i++){

                int nextNode = temp.get(i);

                if(!visited[nextNode]){//방문한적이 없으면
                    visited[nextNode] = true;
                    queue.add(nextNode);
     
                    lenArr[nextNode] = lenArr[currNode]+1;
                }

            }


        }

        

        

    }

}



//모든 노드에서 1까지 거리구해서 거리 max인 원소 개수구하기

//1부터 모든 노드로부터 거리구하고, bfs로하면 어차피 자동 정렬 되서 나올듯

//일단 2번째 방법으로가죠