package implementation;
import java.util.ArrayList;
import java.util.List;

public class Testt {
    public static int solution(int k, int[] limits, int[][] sockets) {
        int n = limits.length;
        int[] consumption = new int[n];
        List<List<Integer>> children = new ArrayList<>();
        int[] removals = new int[n];

        // Initialize children list
        for (int i = 0; i < n; i++) {
            children.add(new ArrayList<>());
        }

        // Build the tree structure and calculate initial consumption
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                if (sockets[i][j] == -1) {
                    consumption[i] += k;
                } else if (sockets[i][j] > 0) {
                    int child = sockets[i][j] - 1;
                    children.get(i).add(child);
                }
            }
        }

        // Perform DFS from the root (node 0)
        dfs(0, consumption, children, removals, limits, k);

        int totalRemovals = 0;
        for (int removal : removals) {
            totalRemovals += removal;
        }
        return totalRemovals;
    }

    private static int dfs(int node, int[] consumption, List<List<Integer>> children, int[] removals, int[] limits, int k) {
        int totalConsumption = consumption[node];
        for (int child : children.get(node)) {
            totalConsumption += dfs(child, consumption, children, removals, limits, k);
        }

        int numToRemove = 0;
        if (totalConsumption > limits[node]) {
            int excessPower = totalConsumption - limits[node];
            numToRemove = (excessPower + k - 1) / k;  // round up the division
            totalConsumption -= numToRemove * k;
            consumption[node] -= numToRemove * k;
        }

        removals[node] = numToRemove;
        return totalConsumption;
    }

    public static void main(String[] args) {
        int k = 120;
        int[] limits = {1500, 300, 250, 359, 600};
        int[][] sockets = {
                {2, 3, 4, 0, -1},
                {0, 0, 0, 0, 0},
                {-1, -1, -1, 0, 0},
                {0, 0, 5, 0, 0},
                {-1, 0, 0, -1, -1},

        };

        System.out.println(solution(k, limits, sockets));  // Expected output: 7
    }
}

