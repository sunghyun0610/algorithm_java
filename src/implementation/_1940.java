package implementation;

import java.util.Scanner;

public class _1940 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();//재료 개수
        int M=sc.nextInt();//갑옷 만드는데 필요한 수
        int [] num=new int[N];
        for(int i=0;i<N;i++){
            num[i]=sc.nextInt();

        }
        int sum=0;
        int cnt=0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                sum=num[i]+num[j];
                if(sum==M){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
