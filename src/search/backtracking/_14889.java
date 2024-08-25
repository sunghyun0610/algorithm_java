package search.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.nio.Buffer;
import java.util.*;

public class _14889 {
    static int[][] stats;
    static boolean[] visited;
    static int N;
    static int result = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        stats = new int[N][N];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                stats[i][j] = Integer.parseInt(st.nextToken());
            }//입력완료
        }
        combi(0, 0);
        System.out.println(result);
    }

    public static void combi(int idx, int cnt) {
        if (cnt == N / 2) {//팀 구성완료
            diff();
            return;
        }

        for (int i = idx; i < N; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            combi(i + 1, cnt + 1);
            visited[i] = false;
        }
    }

    public static void diff() {
        int team1 = 0;
        int team2 = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {//자기자신은 무조건 0이니까
                if (visited[i] == true && visited[j] == true) {
                    team1 += stats[i][j] + stats[j][i];
                } else if (visited[i] == false && visited[j] == false) {//else로하면 안됨.  ture/false인경우 team2에추가되기 때문.
                    team2 += stats[i][j] + stats[j][i];
                }
            }
        }

        int val = Math.abs(team1 - team2);
        if (val == 0) {
            System.out.println(val);
            System.exit(0);
        }
        result = Math.min(result, val);
    }

}
