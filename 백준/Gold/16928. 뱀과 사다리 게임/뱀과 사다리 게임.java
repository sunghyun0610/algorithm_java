import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] map = new int[101];
    static int answer = Integer.MAX_VALUE;
    static Map<Integer,Integer> ladders;
    static Map<Integer,Integer> snakes;
    static int cnt=0;
    static int[] visited = new int[101];
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
//
//        Move[] ladders = new Move[N];
//        Move[] snakes = new Move[M];

        ladders = new HashMap<>();
        snakes = new HashMap<>();


        for(int i=0;i<N;i++){
            st= new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y =Integer.parseInt(st.nextToken());
            ladders.put(x,y);
            map[x]=1;
        }//사다리 정보 입력 완료, 지도에 1로표시

        for(int i=0;i<M;i++){
            st= new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y =Integer.parseInt(st.nextToken());
            snakes.put(x,y);
            map[x]=2;
        }//뱀 정보 입력 완료 , 지도에 2로표시

        bfs(1);
        System.out.println(visited[100]);




    }
    static void bfs(int pos){
        queue.add(pos);
        visited[pos]=0;
        while(!queue.isEmpty()){
            int x = queue.poll();
            if(x==100) break;
            for(int i=1;i<=6;i++){
                if(x+i<=100) {
                    if (map[x + i] == 0 && visited[x + i] == 0) {
                        //System.out.println("일반칸"+ (x+i));
                        queue.add(x + i);
                        visited[x + i] = visited[x] + 1;

                    }
                    if (map[x + i] == 1 && visited[ladders.get(x + i)] == 0) {
                        int value = ladders.get(x + i);
                       // System.out.println("사다리"+ value);
                        visited[value] = visited[x] + 1;
                        queue.add(value);

                    }
                    if (map[x + i] == 2 && visited[snakes.get(x + i)] == 0) {
                        int value = snakes.get(x + i);
                        //System.out.println("뱀"+ value);
                        visited[value] = visited[x] + 1;
                        queue.add(value);
                    }
                }

            }

        }

    }


}
//주사위를 조작해 내가 원하는 수가 나오게 만들 수 있다. -> 최소 몇 번만에 도착점에 도착할 수 있을까?
//사다리에 도착 : 사다리를 타고 위로 올라간다
//뱀이 있는 칸에 도착 : 뱀을 따라서 내려가게 된다
//목표 : 100번 칸에 도착하는 것 -> 주사위를 굴려야하는 최소 횟수
//게임 크기는 10 * 10
//1 번칸 시작
//이건 그리디가 아님 -> 지금 최선의 선택이 그 후에 영향을 미침
//이건 백트래킹 같은데