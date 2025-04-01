import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//물품의 수
        int K = Integer.parseInt(st.nextToken());//버틸 수 있는 무게

        int[] weights = new int[N+1];
        int[] values = new int[N+1];

        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            int x= Integer.parseInt(st.nextToken());
            int y= Integer.parseInt(st.nextToken());
            weights[i]=x;
            values[i]= y;

        }
        int[][] dp = new int[N+1][K+1];

        for(int i=1;i<=N;i++){
            for(int w=0;w<=K;w++){
                if(weights[i]>w){
                    dp[i][w]=dp[i-1][w]; //처음에는 0이 들어가겠네
                }else {
                    dp[i][w] = Math.max(dp[i-1][w], dp[i-1][w-weights[i]]+values[i]);
                }
            }
        }
        System.out.println(dp[N][K]);

    }
}

