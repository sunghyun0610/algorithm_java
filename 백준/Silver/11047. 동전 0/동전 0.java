
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int cnt =0;// 동전개수 세기

        int [] coins =new int[N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            coins[i] = Integer.parseInt(st.nextToken());
        }
        while (K>0){
            int idx =0;
            for(int i=N-1;i>=0;i--){
                if(K>=coins[i]){
                    idx=i;
                    break;
                }
            }
            int pay = coins[idx];
            int tmp = K/pay;
            cnt+=tmp;
            K -= tmp*pay;
        }
        System.out.println(cnt);
    }
}
