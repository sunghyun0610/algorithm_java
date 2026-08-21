import java.util.*;

class Solution {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int n, m;
    static int answer;

    static int redEndX, redEndY;
    static int blueEndX, blueEndY;

    static boolean[][] redVisited;
    static boolean[][] blueVisited;

    public int solution(int[][] maze) {

        n = maze.length;
        m = maze[0].length;

        int redX = 0, redY = 0;
        int blueX = 0, blueY = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (maze[i][j] == 1) {
                    redX = i;
                    redY = j;
                }
                else if (maze[i][j] == 2) {
                    blueX = i;
                    blueY = j;
                }
                else if (maze[i][j] == 3) {
                    redEndX = i;
                    redEndY = j;
                }
                else if (maze[i][j] == 4) {
                    blueEndX = i;
                    blueEndY = j;
                }
            }
        }

        redVisited = new boolean[n][m];
        blueVisited = new boolean[n][m];

        redVisited[redX][redY] = true;
        blueVisited[blueX][blueY] = true;

        answer = Integer.MAX_VALUE;

        dfs(
            redX, redY,
            blueX, blueY,
            maze,
            0
        );

        return answer == Integer.MAX_VALUE ? 0 : answer;
    }

    static void dfs(
        int redX, int redY,
        int blueX, int blueY,
        int[][] maze,
        int count
    ) {

        // 둘 다 도착
        if (redX == redEndX && redY == redEndY &&
            blueX == blueEndX && blueY == blueEndY) {

            answer = Math.min(answer, count);
            return;
        }

        // 이미 찾은 최솟값보다 같거나 많이 이동했다면 중단
        if (count >= answer) {
            return;
        }

        // 빨강이 도착했는지
        boolean redDone =
            redX == redEndX && redY == redEndY;

        // 파랑이 도착했는지
        boolean blueDone =
            blueX == blueEndX && blueY == blueEndY;

        // 빨강 이동
        for (int rd = 0; rd < 4; rd++) {

            int nextRedX = redX;
            int nextRedY = redY;

            if (!redDone) {
                nextRedX = redX + dx[rd];
                nextRedY = redY + dy[rd];

                // 범위
                if (nextRedX < 0 || nextRedX >= n ||
                    nextRedY < 0 || nextRedY >= m) {
                    continue;
                }

                // 벽
                if (maze[nextRedX][nextRedY] == 5) {
                    continue;
                }

                // 빨강이 이미 방문했던 칸
                if (redVisited[nextRedX][nextRedY]) {
                    continue;
                }
            }

            // 파랑 이동
            for (int bd = 0; bd < 4; bd++) {

                int nextBlueX = blueX;
                int nextBlueY = blueY;

                if (!blueDone) {
                    nextBlueX = blueX + dx[bd];
                    nextBlueY = blueY + dy[bd];

                    // 범위
                    if (nextBlueX < 0 || nextBlueX >= n ||
                        nextBlueY < 0 || nextBlueY >= m) {
                        continue;
                    }

                    // 벽
                    if (maze[nextBlueX][nextBlueY] == 5) {
                        continue;
                    }

                    // 파랑이 이미 방문했던 칸
                    if (blueVisited[nextBlueX][nextBlueY]) {
                        continue;
                    }
                }

                // 같은 칸으로 이동
                if (nextRedX == nextBlueX &&
                    nextRedY == nextBlueY) {
                    continue;
                }

                // 서로의 현재 위치로 이동 (swap)
                if (nextRedX == blueX &&
                    nextRedY == blueY &&
                    nextBlueX == redX &&
                    nextBlueY == redY) {
                    continue;
                }

                // 방문 처리
                if (!redDone) {
                    redVisited[nextRedX][nextRedY] = true;
                }

                if (!blueDone) {
                    blueVisited[nextBlueX][nextBlueY] = true;
                }

                dfs(
                    nextRedX, nextRedY,
                    nextBlueX, nextBlueY,
                    maze,
                    count + 1
                );

                // 백트래킹
                if (!redDone) {
                    redVisited[nextRedX][nextRedY] = false;
                }

                if (!blueDone) {
                    blueVisited[nextBlueX][nextBlueY] = false;
                }
            }
        }
    }
}