package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int M= Integer.parseInt(st.nextToken());
        int N= Integer.parseInt(st.nextToken());
        for(int i=M;i<=N;i++){
            prime(i);
        }
    }

    public static void prime(int N){
        if(N==1) return;
        if(N==2 || N==3){
            System.out.println(N);
            return;
        }
        int half= (int) Math.sqrt(N);
        for(int i=2;i<=half;i++){
            if(N%i==0) return;
        }
        System.out.println(N);


    }
}
/*
소수 구하기 알고리즘 : 에라토스테네스의 체
소수의 배수 제거:

2부터 시작하여, 그 수가 소수로 판명되면 그 수의 배수들을 모두 제거합니다. 이때, 배수들은 소수가 아니므로 isPrime[j]를 false로 설정합니다.
2의 배수(4, 6, 8, 10, ...)를 제거한 다음, 3으로 넘어가 3의 배수(6, 9, 12, ...)를 제거합니다.
이미 제거된 수는 건너뛰고, 소수의 배수를 계속 제거합니다.
public class _1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);

        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes algorithm
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Output primes in the range [M, N]
        StringBuilder sb = new StringBuilder();
        for (int i = M; i <= N; i++) {
            if (isPrime[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }
}
*/