package search.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15686_2 {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;//치킨집에대한 visited
    static int[] di = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int min = Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());//지도 크기
        M = Integer.parseInt(st.nextToken());// 치킨집 개수
        map = new int[N + 1][N + 1];//좌표가 1,1 부터 시작하기 때문
        visited = new boolean[N + 1][N + 1];
        for (int i = 1; i < N + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N + 1; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }//집 , 치킨집 위치 입력 완료
        //일단 모든 집들을 브루트포스로 탐색해야댐.
        selectChicken(1, 1, 0);
        System.out.println(min);
    }

    public static void selectChicken(int x, int y, int cnt) {
        if (cnt == M) {
            chickenDis();
            return;
        }
        for (int i = x; i < N + 1; i++) {
            for (int j = (i == x ? y : 1); j < N + 1; j++) {
                if (map[i][j] == 2 && !visited[i][j]) {
                    visited[i][j] = true;
                    selectChicken(i, j + 1, cnt + 1);
                    visited[i][j] = false;
                }//이상 치킨집 M개 조합이 끝.
            }
        }
    }

    public static void chickenDis() {
        //여기서 집별로 최단 치킨 거리를 찾아야겠다.
        int cur_dis = 0;
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                if (map[i][j] == 1) {
                    cur_dis += dis(i, j);//치킨거리 총합 구함
                }
            }
        }
        System.out.println("min: " + min);
        min = Math.min(min, cur_dis);
    }

    public static int dis(int x, int y) {
        int result = Integer.MAX_VALUE;
        int dis = 0;
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                if (visited[i][j] && map[i][j] == 2) {
                    dis = Math.abs(x - i) + Math.abs(y - j);
                    System.out.println("dis"+dis);
                    result = Math.min(dis, result);
                    System.out.println("result"+result);
                }

            }
        }
//        System.out.println("result" + result);
        return result;//한 집에대한 치킨거리 구함
    }
}
